package design_patterns.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateMail(MailInfo mailInfo) {
        return "с днем рождения";
    }

    @Override
    public int myCode() {
        return 3;
    }
}
