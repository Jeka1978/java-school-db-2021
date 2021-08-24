package java8.streams_examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
public class ReduceExampleMain {
    public static void main(String[] args) {
        Optional<String> optional = Stream.of("Вася", "Лена", "Горлум").reduce((s, s2) -> s + "," + s2);

        System.out.println(optional.get());

        Map<String, Integer> map = new HashMap<>(Map.of("a", 1, "b", 2));


        Map<String, Integer> map1 = Stream.of(new Employee("Vasya", 10), new Employee("Vasya", 20))
                .collect(toMap(Employee::getName, Employee::getSalary, Integer::sum));
        System.out.println("map1 = " + map1);




    }
}
