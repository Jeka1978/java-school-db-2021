package homework.matematik;

import homework.lab3.utils.RandomUtil;

import static homework.matematik.Operation.PLUS;

/**
 * @author Evgeny Borisov
 */
public class KinderGardenPlusExerciseCreator implements ExerciseCreator {
    private ABRangeExerciseCreatorAssistant assistant = new ABRangeExerciseCreatorAssistant(0, 10);

    @Override
    public Exercise create() {
        Exercise exercise = assistant.createTemplate();
        exercise.setOperation(PLUS);
        exercise.setAnswer(exercise.getA()+ exercise.getB());
        return exercise;
    }
}
