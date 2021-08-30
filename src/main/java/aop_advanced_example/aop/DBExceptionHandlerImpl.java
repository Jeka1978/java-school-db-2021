package aop_advanced_example.aop;

import aop_advanced_example.DBException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
@Component
public class DBExceptionHandlerImpl implements DBExceptionHandler {
    @Value("${mails}")
    private String[] mails;

    @Override
    public void handle(DBException ex) {
        Arrays.stream(mails).forEach(s -> System.out.println("mail to " + s + " " + ex.getMessage()));
    }
}
