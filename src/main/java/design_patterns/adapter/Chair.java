package design_patterns.adapter;

/**
 * @author Evgeny Borisov
 */
public class Chair implements Costable {
    @Override
    public int cost() {
        return 5;
    }
}
