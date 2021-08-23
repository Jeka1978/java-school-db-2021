package homework.matematik;

/**
 * @author Evgeny Borisov
 */
public class SecondDegreeMultiplyExerciseCreator implements ExerciseCreator {
    private ExerciseCreatorAssistant assistant = new ABRangeExerciseCreatorAssistant(0, 10);

    @Override
    public Exercise create() {
        Exercise exercise = assistant.createTemplate();
        exercise.setOperation(Operation.MULTIPLY);
        exercise.setAnswer(exercise.getA() * exercise.getB());
        return exercise;
    }
}
