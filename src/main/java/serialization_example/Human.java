package serialization_example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor

public class Human implements Serializable {
    private String name;
    private transient int age;


    private final static long serialVersionUID = 1;


    {
        System.out.println("I'm init");
    }






}
