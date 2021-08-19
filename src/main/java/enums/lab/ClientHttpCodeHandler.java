package enums.lab;

/**
 * @author Evgeny Borisov
 */
public class ClientHttpCodeHandler implements HttpCodeHandler {
    @Override
    public void handle(int code) {
        System.out.println("error with code "+code+" happened in client side, waiting two min before last retry");
    }
}
