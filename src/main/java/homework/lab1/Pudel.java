package homework.lab1;

/**
 * @author Evgeny Borisov
 */
public class Pudel extends Dog {

    @Override
    public void лаять() {
        throw new UnsupportedOperationException();
    }


    public static void main(String[] args) {
        Dog dog = new Pudel();
        dog.лаять();
    }
}
