package enums.lab;

/**
 * @author Evgeny Borisov
 */
public class ServerHttpCodeHandler implements HttpCodeHandler {
    @Override
    public void handle(int code) {
        System.out.println("error with code "+code+" happened in server side, waiting two min before last retry");
    }
}
