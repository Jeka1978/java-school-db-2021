package real_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class TalkingRobot {

    @InjectRandomName  //todo make it do something
    private String name;


    @Autowired
    private List<Quoter> quoters;



    @PostConstruct
    public void talk(){
        System.out.println("name = " + name);
        quoters.forEach(Quoter::sayQuote);
    }
}
