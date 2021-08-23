package homework.matematik;

import homework.lab1.Animal;
import homework.lab1.Dog;
import object_casting.Cat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class NataliaVaisevnaMain {

    public static void main(String[] args) {

        List animals = new ArrayList();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add("new Cat()");


        Animal o = (Animal) animals.get(0);


        ExaminatorImpl examinator = new ExaminatorImpl(List.of(new SecondDegreeMinusExerciseCreator()
                , new SecondDegreeMultiplyExerciseCreator(),
                new SecondSchoolDegreePlusExerciseCreator()));


        examinator.generate(10).forEach(System.out::println);
    }
}
