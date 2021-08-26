package my_spring;

import com.db.model.Person;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


       /* ApplicationContext context = new ApplicationContext("com.epam", Map.of(Speaker.class, ConsoleSpeaker.class));
        context.getObject(IRobot.class).cleanRoom();*/


        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);

        iRobot.cleanRoom();
    }
}
