package homework.matematik;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class NinaNikolaevnaMain {
    public static void main(String[] args) {
        ExaminatorImpl examinator = new ExaminatorImpl(List.of(new KinderGardenPlusExerciseCreator(), new KinderGardenMinusExerciseCreator()));

        examinator.generate(10).forEach(System.out::println);



    }
}
