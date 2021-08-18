package homework.lab2;

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

    private Client(Builder builder) {
        this.debt = builder.debt;
        this.bonus = builder.bonus;
        this.name = builder.name;
        this.salary = builder.salary;
    }



    public static Builder builder(){
        return new Builder();
    }

     static class Builder {
        private Integer debt;
        private Integer bonus;
        private String name;
        private Integer salary;

        private boolean wasUsed = false;


        public Builder debt(int debt) {
            this.debt = debt;
            return this;
        }

        public Builder bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Client build() {
            if (wasUsed) {
                throw new IllegalStateException("builder was already used, create new one");
            }
            wasUsed = true;
            validate();
            return new Client(this);

        }

        private void validate() {
//            if(debt==null||bonus==null||)
        }

    }



}




