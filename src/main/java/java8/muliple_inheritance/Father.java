package java8.muliple_inheritance;

/**
 * @author Evgeny Borisov
 */
public interface Father {
    default void talkToChildren(){
        System.out.println("Дети, ко мне");
    }
}
