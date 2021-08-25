package design_patterns.adapter;

import lombok.RequiredArgsConstructor;
import lombok.experimental.Delegate;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public class Costable2PricableAdapter implements Pricable {

    private final Costable costable;

    @Override
    public int getPrice() {
        return costable.cost();
    }

}
