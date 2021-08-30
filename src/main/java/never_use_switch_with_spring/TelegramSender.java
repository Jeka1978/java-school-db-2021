package never_use_switch_with_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class TelegramSender implements MessageSender {

    @Override
    public void send(Message message) {
        System.out.println("telegram was sent: "+message.getContent());
    }

    @Override
    public String getMyType() {
        return "tel";
    }
}
