package design_patterns.adapter;

/**
 * @author Evgeny Borisov
 */
public class Table implements Costable {
    @Override
    public int cost() {
        return 10;
    }
}
