package java8;

/**
 * @author Evgeny Borisov
 */
public interface Action<T> {
    void doAction(T t);
}
