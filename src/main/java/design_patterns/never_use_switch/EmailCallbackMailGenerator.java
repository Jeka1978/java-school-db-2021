package design_patterns.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateMail(MailInfo mailInfo) {
        return "don't call us we call you " + mailInfo.getClientName();
    }

    @Override
    public int myCode() {
        return 2;
    }
}
