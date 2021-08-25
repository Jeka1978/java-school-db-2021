package my_spring;

import lombok.Data;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactoryTest {

    @Data
    static class Troll {
        @InjectRandomInt(min = 100, max = 200)
        private int power;
        @InjectRandomInt(min = 10, max = 20)
        private int speed;
    }


    @Test
    public void testInjectRandomIntIsWorking() {

        Troll troll = ObjectFactory.getInstance().createObject(Troll.class);

        System.out.println("troll = " + troll);
        Assert.assertTrue(troll.getPower()>99);
        Assert.assertTrue(troll.getSpeed()>9);


    }
}




