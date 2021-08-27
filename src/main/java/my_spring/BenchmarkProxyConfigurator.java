package my_spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object configure(Object t, Class<?> type) {
        if (type.isAnnotationPresent(Benchmark.class)||
                Arrays.stream(type.getMethods()).anyMatch(method -> method.isAnnotationPresent(Benchmark.class))) {
            return Proxy.newProxyInstance(type.getClassLoader()
                    , type.getInterfaces()
                    , new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            Method originalMethod = type.getMethod(method.getName(), method.getParameterTypes());
                            if (originalMethod.isAnnotationPresent(Benchmark.class)||type.isAnnotationPresent(Benchmark.class)) {
                                System.out.println("********BENCHMARK STARTED FOR METHOD " + method.getName() + " **********");
                                long start = System.nanoTime();
                                Object retVal = method.invoke(t, args);
                                long end = System.nanoTime();
                                System.out.println(end - start);

                                System.out.println("********BENCHMARK ENDED FOR METHOD " + method.getName() + " **********");


                                return retVal;
                            }else {
                                return method.invoke(t, args);
                            }
                        }
                    }
            );
        }
        return t;

    }
}
