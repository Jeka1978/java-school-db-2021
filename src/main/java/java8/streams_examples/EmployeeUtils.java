package java8.streams_examples;

import java.util.List;
import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtils {




    public static int totalSalary(List<Employee> employees) {
        return employees.stream().mapToInt(Employee::getSalary).sum();
    }

    //todo do not use this on numbers - this way is for reducing objects, not promitives
    public static int totalSalaryReduceSolution(List<Employee> employees) {
        Optional<Integer> integerOptional = employees.stream()
                .filter(employee -> employee.getName().startsWith("A"))
                .map(Employee::getSalary)
                .reduce(Integer::sum);

        return integerOptional.get();

    }


}
