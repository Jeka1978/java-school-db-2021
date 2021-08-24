package java8.streams_examples;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Money {
    private String currency;
    private int amount;


    public Money add(Money anotherMoney) {
        if (this.currency == anotherMoney.currency) {
            return new Money(currency, amount + anotherMoney.amount);
        }else {
            //todo переводим всё в доллары
            throw new UnsupportedOperationException();
        }
    }






}
