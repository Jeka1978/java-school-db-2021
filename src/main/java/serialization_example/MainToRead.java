package serialization_example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Evgeny Borisov
 */
public class MainToRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("c:\\tmp\\person.data");

        FileInputStream fis = new FileInputStream(file);

        ObjectInputStream ois = new ObjectInputStream(fis);


        Object o = ois.readObject();

        System.out.println(o);


    }
}
