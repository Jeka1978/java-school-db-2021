package homework.lab2;

import lombok.Data;
import lombok.ToString;

/**
 * @author Evgeny Borisov
 */
@ToString
public class Client {
    private final int debt; //todo you can't remove final
    private final int bonus;
    private final String name;
    private final int salary;

    public Client(int debt, int bonus, String name, int salary) {
        this.debt = debt;
        this.bonus = bonus;
        this.name = name;
        this.salary = salary;
    }
}
