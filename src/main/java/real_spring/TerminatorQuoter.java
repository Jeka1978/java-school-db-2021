package real_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(1)
public class TerminatorQuoter implements Quoter {


    private List<String> messages;


    @Value("${terminator}")
    public void setMessages(String[] messages,@Value("${JAVA_HOME}")String java) {
        System.out.println("java = " + java);
        this.messages = new ArrayList<>(asList(messages));
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    public void terminate() {
        System.out.println("you are terminated...");
    }

}


