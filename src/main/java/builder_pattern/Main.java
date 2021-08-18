package builder_pattern;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Employee.EmployeeBuilder builder = Employee.builder();
        Employee employee = builder
                .bonus(12)
                .name("Vasya")
                .salary(2000)
                .beer("tuborg",1)
                .beer("Nevskoe",3)
                .beer("Baltika",2)
                .рыба("Carpion")
                .build();

        Employee maksim = builder.name("Maksim").build();
        System.out.println(maksim);

        System.out.println(employee);
    }
}
