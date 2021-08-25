package design_patterns.adapter;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        ProductHandler productHandler = new ProductHandler();

        Costable product = productRepo.getProduct();

        productHandler.handle(new Costable2PricableAdapter(product));
    }
}
