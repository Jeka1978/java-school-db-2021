package design_patterns.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public interface MailGenerator {
    String generateMail(MailInfo mailInfo);
    int myCode();
}
