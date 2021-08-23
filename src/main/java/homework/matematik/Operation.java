package homework.matematik;

import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum Operation {
    PLUS("+"),MINUS("-"),MULTIPLY("*"), DIVIDE("/");
    private final String sign;

    @Override
    public String toString() {
        return sign;
    }
}
