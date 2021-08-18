package collections;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        EdenNumbersIterator iterator = new EdenNumbersIterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
            Thread.sleep(100);
        }
    }
}
