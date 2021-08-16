package homework.lab1;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal{
    @Override
    public void makeVoice() {
        System.out.println("au au");
    }

    @Override
    public void move() {
        System.out.println("top top");
    }
}
