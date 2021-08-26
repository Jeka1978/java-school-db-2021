package my_spring;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Benchmark
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @PostConstruct
    public void init() { //todo teach our framework to run all methods which starts with init
        System.out.println(cleaner.getClass());
    }

    public void cleanRoom() {
        speaker.speak("Я начал работать");
        cleaner.clean();
        speaker.speak("Я закончил работать");
    }
}
