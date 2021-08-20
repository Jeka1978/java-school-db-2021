package design_patterns.never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class MailSender {

    public void send(MailInfo mailInfo) {
        //todo refactor this to beautiful code
        if (mailInfo.getMailType() == 1) {
            //50 lines of code which send welcome mail
            System.out.println("Welcome mail was sent "+mailInfo.getContext());
        } else if (mailInfo.getMailType() == 2) {
            //50 lines of code which send welcome mail
            System.out.println("Happy Birthdate mail was sent "+mailInfo.getContext());
        }

    }
}
