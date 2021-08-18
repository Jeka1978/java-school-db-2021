package collections;

import java.util.Iterator;

/**
 * @author Evgeny Borisov
 */
public class EdenNumbersIterator implements Iterator<Integer> {
    private int i = 0;

    @Override
    public boolean hasNext() {
        return i < Integer.MAX_VALUE - 2;
    }

    @Override
    public Integer next() {
        return i += 2;
    }


}
