package design_patterns.never_use_switch;

import com.github.javafaker.Faker;
import homework.lab3.utils.RandomUtil;
import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
        Faker faker = new Faker();
        while (true) {
            MailInfo mailInfo = MailInfo.builder()
                    .clientName(faker.gameOfThrones().character())
                    .mailType(RandomUtil.between(1, 3))
                    .build();

            try {
                mailSender.send(mailInfo);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            Thread.sleep(2000);

        }
    }
}
