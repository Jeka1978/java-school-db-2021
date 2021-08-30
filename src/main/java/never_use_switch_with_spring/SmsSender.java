package never_use_switch_with_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class SmsSender implements MessageSender {

    @Override
    public void send(Message message) {
        System.out.println("sms was sent: "+message.getContent());
    }

    @Override
    public String getMyType() {
        return "sms";
    }
}
