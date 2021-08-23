package homework.matematik;

import homework.lab3.utils.RandomUtil;

import static homework.matematik.Operation.MINUS;

/**
 * @author Evgeny Borisov
 */
public class KinderGardenMinusExerciseCreator implements ExerciseCreator {
    @Override
    public Exercise create() {

        int a = RandomUtil.between(1, 10);
        int b = RandomUtil.between(0, a);

        return Exercise.builder()
                .a(a)
                .b(b)
                .operation(MINUS)
                .answer(a - b)
                .build();

    }
}
