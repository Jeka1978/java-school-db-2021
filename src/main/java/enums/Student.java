package enums;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private MaritalStatus maritalStatus;


    public static void main(String[] args) {
        Student vasya = Student.builder().name("Vasya").maritalStatus(MaritalStatus.SINGLE).build();
        Student lena = Student.builder().name("Vasya").maritalStatus(MaritalStatus.SINGLE).build();
        System.out.println(vasya.getMaritalStatus()==lena.getMaritalStatus());


        System.out.println(vasya.getMaritalStatus().getRussianDesc());


        MaritalStatus maritalStatus = MaritalStatus.findByDbCode(2);

        Student petya = new Student("Petya", maritalStatus);

        System.out.println(petya.getMaritalStatus().getRussianDesc());


        System.out.println(petya.getMaritalStatus().toString());

    }
}





