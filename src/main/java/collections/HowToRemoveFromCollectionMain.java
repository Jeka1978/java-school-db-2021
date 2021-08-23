package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class HowToRemoveFromCollectionMain {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of("Arnold", "Stallone", "Chuck", "Brus"));

        String personToRemove = "Chuck";


        strings.removeIf(next -> next.equalsIgnoreCase(personToRemove));


        for (String string : strings) {
            if (string.equalsIgnoreCase(personToRemove)) {
                strings.remove(string);
            }
        }

        System.out.println(strings);

    }
}





