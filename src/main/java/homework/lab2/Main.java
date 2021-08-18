package homework.lab2;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        Client client = Client.builder()
                .bonus(30)
                .name("Nikita")
                .salary(20000)
                .debt(12)
                .build();

        System.out.println(client);

    }








































}

