package serialization_example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Evgeny Borisov
 */
public class MainToWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("c:\\tmp\\person.data");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file);

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Human human = new Human("Anya", 18);

        oos.writeObject(human);














    }
}
