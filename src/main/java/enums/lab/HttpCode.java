package enums.lab;

import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum HttpCode {
    CLIENT_ERROR(400, 499, new ClientHttpCodeHandler()),
    SERVER_ERROR(500, 600, new ClientHttpCodeHandler());

    private final int min;
    private final int max;


    private final HttpCodeHandler httpCodeHandler;

    public static void handle(int httpCode) {

        for (HttpCode httpCodeEnum : values()) {
            if (httpCode <= httpCodeEnum.max && httpCode >= httpCodeEnum.min) {
                httpCodeEnum.httpCodeHandler.handle(httpCode);
                return;
            }
        }
        throw new UnsupportedOperationException(httpCode + " unsupported");

    }


}
