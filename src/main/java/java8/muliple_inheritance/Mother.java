package java8.muliple_inheritance;

import com.db.model.Person;

import java.util.List;

import static java.lang.System.out;

/**
 * @author Evgeny Borisov
 */
public interface Mother {



    default void talkToChildren(){
        out.println("ДЕТИ, КО МНЕ!!!!!!");
    }


    private static void abc(){
        out.println("abc");
    }




}
