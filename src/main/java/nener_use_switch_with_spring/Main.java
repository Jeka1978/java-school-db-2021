package nener_use_switch_with_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MessageDistributor distributor = new MessageDistributor();

        while (true) {
            Message message = DataProducer.generateMessage();
            distributor.distribute(message);
            Thread.sleep(500);
        }
    }
}
