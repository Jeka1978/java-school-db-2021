package java8;

import java.util.Collections;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ListUtils {


    public static <T> void forEachWithDelay(List<T> list, int delay/* one more argument*/){
        // delay will be used between each element
        //todo finish this
    }


    public static <T> int countDuplicate(T value, List<T> list) {
        return Collections.frequency(list, value);
    }


    public static <T> int countDuplicate(T value, List<T> list, Equalator<T> equalator) {

        int counter = 0;

        for (T t : list) {
            if (equalator.equals(t, value)) {
                counter++;
            }

        }
        return counter;


    }
}
