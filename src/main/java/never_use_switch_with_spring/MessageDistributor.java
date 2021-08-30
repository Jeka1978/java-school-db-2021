package never_use_switch_with_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import real_spring.Quoter;

import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Service
public class MessageDistributor {

    @Autowired
    private ApplicationContext context;



    @Autowired
    @Qualifier("senders")
    private Map<String,MessageSender> senderMap;



    @Autowired
    private DataProducer dataProducer;


    public void distribute(Message message) {

        MessageSender messageSender = senderMap.get(message.getChannelName());
        if (messageSender == null) {
            throw new IllegalStateException(message.getChannelName() + " not supported yet");
        }
        messageSender.send(message);

    }
}








