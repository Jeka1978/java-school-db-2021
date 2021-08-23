package homework.matematik;

import homework.lab3.utils.RandomUtil;
import lombok.RequiredArgsConstructor;

import static homework.matematik.Operation.PLUS;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public class ABRangeExerciseCreatorAssistant implements ExerciseCreatorAssistant {
    private final int min;
    private final int max;

    @Override
    public Exercise createTemplate() {
        int a = RandomUtil.between(min, max);
        int b = RandomUtil.between(min, max);
        Exercise exercise = Exercise.builder()
                .a(a)
                .b(b)
                .build();
        return exercise;
    }
}
