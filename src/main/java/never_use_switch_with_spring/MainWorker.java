package never_use_switch_with_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component

public class MainWorker {
    private final DataProducer dataProducer;
    private final MessageDistributor distributor;


    public MainWorker(DataProducer dataProducer, MessageDistributor distributor) {
        this.dataProducer = dataProducer;
        this.distributor = distributor;
    }

    @Scheduled(fixedDelay = 500)
    public void work() {
        Message message = dataProducer.generateMessage();
        distributor.distribute(message);
    }
}






