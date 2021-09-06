package aop_advanced_example;

import aop_advanced_example.services.ServiceA;
import org.springframework.context.annotation.*;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@PropertySource("classpath:application.properties")
public class MainConf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);


        ServiceA serviceA = context.getBean(ServiceA.class);

        try {
            serviceA.doA();
        } catch (DBException exception) {
            System.out.println("У нас проблемы... База перегружается");
        }
        serviceA.doA();
    }
}
