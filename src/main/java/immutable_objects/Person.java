package immutable_objects;

import lombok.Value;
import lombok.With;

import java.time.LocalDate;

/**
 * @author Evgeny Borisov
 */

@Value
@With
public class Person {
    String name;
    int age;
    int salary;

    public Person plusSalary(int delta) {
        return new Person(name, age, salary + delta);
    }


    public static void main(String[] args) {


        LocalDate now = LocalDate.now();

        LocalDate localDate = now.withYear(1800);

        LocalDate date = localDate.plusYears(1);


        Person jeka = new Person("jeka", 43, 2000);
        Person vasya = jeka.withName("Vasya").withAge(20);

        System.out.println(jeka);
        System.out.println(vasya);
        while (true) {
            String str = "java";
            str = str.toUpperCase();
        }
    }




    /* public static void main(String[] args) {
        String str = "java";
        String str2 = "java";

        Random random = new Random();
        List<String> strings = new ArrayList<>();

        while (true) {
            String s = new StringBuilder().append("ja").append(random.nextInt(10000)).append("sdasd").toString();
            if (random.nextInt(200) == 10) {
                strings.add(s);
            }
            if (random.nextInt(500) == 10) {
                System.out.println(strings.size());
            }
        }



    }*/
}
