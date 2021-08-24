package java8.streams_examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtilsTest {

    @Test
    public void getNamesSortedBySalary() {

        List<Employee> list = List.of(
                Employee.builder().name("Lena").salary(10).build(),
                Employee.builder().name("Masha").salary(12).build(),
                Employee.builder().name("Kolya").salary(9).build()
        );

        List<String> names = EmployeeUtils.getNamesSortedBySalary(list);

        Assert.assertEquals("Masha",names.get(0));
        Assert.assertEquals("Lena",names.get(1));
        Assert.assertEquals("Kolya",names.get(2));

    }
}