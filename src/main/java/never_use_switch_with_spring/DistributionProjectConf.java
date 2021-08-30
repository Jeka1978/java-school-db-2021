package never_use_switch_with_spring;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
public class DistributionProjectConf {


    @Bean
    @Qualifier("senders")
    public Map<String,MessageSender> senderMap(List<MessageSender> messageSenders){
        return messageSenders.stream().collect(toMap(MessageSender::getMyType, identity()));
    }


    @Bean
    public Faker dataFaker(){
        return new Faker();
    }


}






