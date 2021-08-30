package never_use_switch_with_spring;

import com.github.javafaker.Faker;
import homework.lab3.utils.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */

@Component
public class DataProducer {
    private List<String> channels = List.of("sms", "tel","viber");

    @Autowired
    private Faker faker;

    public Message generateMessage() {
        return Message.builder()
                .channelName(RandomUtil.getRandomElement(channels))
                .content(faker.chuckNorris().fact())
                .build();
    }
}





