package real_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        System.out.println(context.getBean(Integer.class));
        System.out.println(context.getBean(Integer.class));
        System.out.println(context.getBean(Integer.class));
        context.close();
    }
}
