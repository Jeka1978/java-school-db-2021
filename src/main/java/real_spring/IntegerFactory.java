package real_spring;

import homework.lab3.utils.RandomUtil;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Evgeny Borisov
 */
public class IntegerFactory  {
    public Integer randomInt() throws Exception {
        return RandomUtil.between(100,1200);
    }


}
