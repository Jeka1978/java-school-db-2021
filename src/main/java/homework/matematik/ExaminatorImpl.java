package homework.matematik;

import homework.lab3.utils.RandomUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ExaminatorImpl implements Examinator {

    private List<ExerciseCreator> creators;

    public ExaminatorImpl(List<ExerciseCreator> creators) {
        this.creators = creators;
    }

    @Override
    public Exercise generate() {
        return RandomUtil.getRandomElement(creators).create();
    }

    @Override
    public List<Exercise> generate(int num) {

        List<Exercise> list = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            list.add(generate());
        }
        return list;

    }
}








