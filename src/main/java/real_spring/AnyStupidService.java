package real_spring;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class AnyStupidService {
   /* @EventListener(ContextRefreshedEvent.class)
    protected void sayKaka(){
        System.out.println("asds");
    }*/
}
