package java8.optional_examples;

import java8.streams_examples.Employee;

import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jeka", 2);
        Optional<Employee> optional = Optional.of(employee);

        optional.map(e -> e.getName().length());


    }
}
