package java8.muliple_inheritance;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author Evgeny Borisov
 */
public class Daughter implements Father,Mother{


    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 4);

        for (Integer integer : integers) {
            System.out.println(integer);
        }

        integers.forEach(System.out::println);

    }



    @Override
    public void talkToChildren() {
        Father.super.talkToChildren();
    }
}
