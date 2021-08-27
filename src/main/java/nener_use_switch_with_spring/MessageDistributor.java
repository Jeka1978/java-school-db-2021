package nener_use_switch_with_spring;

/**
 * @author Evgeny Borisov
 */
public class MessageDistributor {

    public void distribute(Message message) {
        if (message.getChannelName() == "sms") {
            //40 lines of code
            System.out.println("sms was sent with text: "+message.getContent());
        }
    }
}
