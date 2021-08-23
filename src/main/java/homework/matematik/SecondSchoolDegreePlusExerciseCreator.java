package homework.matematik;

import homework.lab3.utils.RandomUtil;

import static homework.matematik.Operation.PLUS;

/**
 * @author Evgeny Borisov
 */
public class SecondSchoolDegreePlusExerciseCreator implements ExerciseCreator {

    private ExerciseCreatorAssistant assistant = new ABRangeExerciseCreatorAssistant(0, 100);

    @Override
    public Exercise create() {
        Exercise exercise = assistant.createTemplate();
        exercise.setOperation(PLUS);
        exercise.setAnswer(exercise.getA()+ exercise.getB());
        return exercise;
    }
}
