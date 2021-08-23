package collections;

import java.util.Iterator;

/**
 * @author Evgeny Borisov
 */
public class EdenNumbersIterable implements Iterable<Integer> {

    @Override
    public Iterator<Integer> iterator() {
        return new EdenNumbersIterator();
    }

    public static void main(String[] args) {
        EdenNumbersIterable iterable = new EdenNumbersIterable();
        Iterator<Integer> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }

        Iterator<Integer> iterator1 = iterable.iterator();
    }
}
