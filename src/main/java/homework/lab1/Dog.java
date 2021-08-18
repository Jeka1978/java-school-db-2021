package homework.lab1;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal{


    public void лаять(){

    }


    @Override
    public void makeVoice() {
        System.out.println("au au");
    }

    @Override
    public void move() {
        System.out.println("top top");
    }


    public static void main(String[] args) {
        Dog dog = new Dog();

        Animal animal = dog;

       Dog dog2 = (Dog) animal;

    }
}
