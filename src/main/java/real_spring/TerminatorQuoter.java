package real_spring;

import lombok.Setter;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.PreDestroy;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class TerminatorQuoter implements Quoter {

    @Setter
    private List<String> messages;

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }



    public void terminate(){
        System.out.println("you are terminated...");
    }

}


