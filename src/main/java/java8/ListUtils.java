package java8;

import lombok.SneakyThrows;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Evgeny Borisov
 */
public class ListUtils {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        forEachWithDelay(list,500, (Consumer<Integer>) integer -> System.out.println(integer));
    }


    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Action<T> action){
        for (T t : list) {
            Thread.sleep(delay);
            action.doAction(t);
        }
    }
    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> action){
        for (T t : list) {
            Thread.sleep(delay);
            action.accept(t);
        }
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
