package design_patterns.singleton_anti_pattern;

import lombok.AllArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public class TaxCalc {


    public double withNds(double price) {
        return NdsResolverSingleton.getInstance().getNds() * price + price;
    }


}
