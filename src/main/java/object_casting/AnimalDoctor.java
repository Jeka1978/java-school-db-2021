package object_casting;

/**
 * @author Evgeny Borisov
 */
public class AnimalDoctor {

    public void a(){
        treat(new Dog(),12,3,4,5);
    }

    public void treat(Animal animal, int... numbers) {
        animal.speak();
        animal.speak();
        animal.speak();


        if (animal instanceof Dog) {

            Dog dog = (Dog) animal;
            dog.дайПалку();
        }


    }

    public static void main(String[] args) {
        Animal cat = new Dog();
        AnimalDoctor doctor = new AnimalDoctor();
        doctor.treat(cat);
    }
}
