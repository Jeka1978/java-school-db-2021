package design_patterns.never_use_switch;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class MailSender {


    private Map<Integer,MailGenerator> mailGeneratorMap = new HashMap<>();


    @SneakyThrows
    public MailSender() {
        Reflections scanner = new Reflections("design_patterns.never_use_switch");
        Set<Class<? extends MailGenerator>> classes = scanner.getSubTypesOf(MailGenerator.class);
        for (Class<? extends MailGenerator> generatorClass : classes) {
            MailGenerator mailGenerator = generatorClass.getDeclaredConstructor().newInstance();
            mailGeneratorMap.put(mailGenerator.myCode(), mailGenerator);
        }
    }

    public void send(MailInfo mailInfo) {
        int mailType = mailInfo.getMailType();
        MailGenerator mailGenerator = mailGeneratorMap.get(mailType);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailType + " not supported yet");
        }
        String mail = mailGenerator.generateMail(mailInfo);


        send(mail);


    }

    private void send(String mail) {
        System.out.println("sending... "+mail);
    }
}
