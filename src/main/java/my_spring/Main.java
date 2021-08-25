package my_spring;

import com.db.model.Person;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        IRobot iRobot = new IRobot();
        iRobot.cleanRoom();
    }
}
