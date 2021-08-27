package real_spring;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class TalkingRobot {

    @InjectRandomName  //todo make it do something
    private String name;



    @Setter
    @Autowired
    private List<Quoter> quoters;

    @PostConstruct
    public void talk(){
        System.out.println("name = " + name);
        quoters.forEach(Quoter::sayQuote);
    }
}
