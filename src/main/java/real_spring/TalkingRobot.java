package real_spring;

import lombok.Setter;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class TalkingRobot {

//    @InjectRandomName  //todo make it do something
    private String name;

    @Setter
    private List<Quoter> quoters;

    @PostConstruct
    public void talk(){
        quoters.forEach(Quoter::sayQuote);
    }
}
