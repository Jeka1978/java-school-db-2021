package design_patterns.adapter;

/**
 * @author Evgeny Borisov
 */
public class ProductHandler {

    public void handle(Pricable pricable) {
        System.out.println(pricable);
    }
}
