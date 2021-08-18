package multiple_inheritance;

import javax.swing.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class Son implements Mother, Father {
    @Override
    public void drive() {
        System.out.println("Driving");
    }

    @Override
    public void drive(int speed) {

    }


    public static void main(String[] args) {

        int age = Integer.parseInt(JOptionPane.showInputDialog("я загадал число до 100, какое"));

        System.out.println("тебе осталось "+(120-age));

    }


}





