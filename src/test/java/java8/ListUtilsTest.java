package java8;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ListUtilsTest {

    @Test
    public void countDuplicate() {

        List<String> list = List.of("java", "scala","JAVA","scala","JavA");
        int counter = ListUtils.countDuplicate("java", list, (t1, t2) -> t1.equalsIgnoreCase(t2));
        Assert.assertEquals(3,counter);

    }
}