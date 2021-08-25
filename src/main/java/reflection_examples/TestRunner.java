package reflection_examples;

import homework.lab1.Animal;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Evgeny Borisov
 */
public class TestRunner {


    @SneakyThrows
    public static void runAllTestMethods(String className) {
        Class<?> type = Class.forName(className);
        runAllTestMethods(type);
    }

    @SneakyThrows
    public static void runAllTestMethods(Class<?> type) {
        Object o = type.getDeclaredConstructor().newInstance();
        runAllTestMethods(o);
    }


    @SneakyThrows
    public static void runAllTestMethods(Object o) {

        Method[] methods = o.getClass().getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("test") || method.isAnnotationPresent(TestMethod.class)) {
                TestMethod annotation = method.getAnnotation(TestMethod.class);
                if (annotation != null) {
                    int numberOfInvocations = annotation.numberOfInvocations();
                    for (int i = 0; i < numberOfInvocations; i++) {
                        method.invoke(o);
                    }
                } else {

                    method.invoke(o);
                }
            }
        }
    }

    public static void printClassData(Object o) {
        Class<?> type = o.getClass();

        System.out.println(Animal.class.isAssignableFrom(type));
        System.out.println(type.getSuperclass());
        System.out.println(type.getName());
        System.out.println(type.getSimpleName());
//        Method[] methods = type.getDeclaredMethods(); // all methods (including private) without parent methods
        Method[] methods = type.getMethods(); // get all public methods including all parents

        for (Method method : methods) {
            System.out.println(method.getName());
//            System.out.println(method.getParameterTypes()[0]);
        }
//        type.getFields()
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType().getSimpleName());
            System.out.println(Modifier.isFinal(field.getModifiers()));
//            System.out.println(Modifier.isStatic(field.getModifiers()));
        }
    }


    public static void main(String[] args) {
//        printClassData(new Employee());


        runAllTestMethods("reflection_examples.PersonTest");
    }


}
