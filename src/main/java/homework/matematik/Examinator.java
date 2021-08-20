package homework.matematik;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface Examinator {
    Exercise generate();
    List<Exercise> generate(int num);
    //todo write an implementation
}
