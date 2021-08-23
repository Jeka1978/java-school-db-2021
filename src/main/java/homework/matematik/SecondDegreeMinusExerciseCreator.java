package homework.matematik;

/**
 * @author Evgeny Borisov
 */
public class SecondDegreeMinusExerciseCreator implements ExerciseCreator {
    private ExerciseCreatorAssistant assistant = new ABRangeExerciseCreatorAssistant(0, 100);

    @Override
    public Exercise create() {
        Exercise exercise = assistant.createTemplate();
        exercise.setOperation(Operation.MINUS);
        exercise.setAnswer(exercise.getA() - exercise.getB());
        return exercise;
    }
}
