package design_patterns.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateMail(MailInfo mailInfo) {
        return "WELCOME new client " + mailInfo.getClientName();
    }

    @Override
    public int myCode() {
        return 1;
    }
}
