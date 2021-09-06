package aop_advanced_example.aop;

import aop_advanced_example.DBException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class ExceptionHandlerAspect {

    @Autowired
    private DBExceptionHandler dbExceptionHandler;

    private Map<DBException, Void> exceptions = new WeakHashMap<>();


    @Pointcut("execution(* aop_advanced_example.services..*.*(..))")
    public void allBusinessMethods() {
    }


    @Before("allBusinessMethods() && @annotation(Deprecated)")
    public void handleOurDeprecatedMethods() {
        System.out.println("Что ж вы уроды, до сих пор не выпилили старые метода");
    }

    @AfterThrowing(pointcut = "allBusinessMethods()", throwing = "ex")
    public void handleDBException(DBException ex) {
        if (!exceptions.containsKey(ex)) {
            exceptions.put(ex, null);
            dbExceptionHandler.handle(ex);
        }

    }
}


