package java8.streams_examples;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class MoneyUtils {

    public static Money total(List<Money> monies) {
        return monies.stream()
                .reduce(Money::add)
//                .reduce(MoneyUtils::joinMoney)
                .get();
    }


    public static Money joinMoney(Money money1, Money money2) {
        if (money1.getCurrency().equals(money2.getCurrency())) {
            return new Money(money1.getCurrency(), money1.getAmount() + money2.getAmount());
        }else {
            throw new UnsupportedOperationException();
        }
    }
}
