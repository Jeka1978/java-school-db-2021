package enums.lab;

/**
 * @author Evgeny Borisov
 */
public class HttpService {

    public void handleHttpCode(int httpCode) {

        HttpCode.handle(httpCode);
    }
}
