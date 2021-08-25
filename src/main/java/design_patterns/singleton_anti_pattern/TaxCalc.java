package design_patterns.singleton_anti_pattern;

import lombok.AllArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public class TaxCalc {

    private NdsResolver ndsResolver;


    public double withNds(double price) {
        return ndsResolver.getNds() * price + price;
    }


}
