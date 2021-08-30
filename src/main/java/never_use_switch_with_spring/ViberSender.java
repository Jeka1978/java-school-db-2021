package never_use_switch_with_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class ViberSender implements MessageSender {
    @Override
    public void send(Message message) {
        System.out.println("VIBER !!!! "+message.getContent());
    }

    @Override
    public String getMyType() {
        return "viber";
    }
}
