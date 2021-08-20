package design_patterns.strategy;

/**
 * @author Evgeny Borisov
 */
public class RadioImpl implements Radio {
    @Override
    public void a() {
        System.out.println("40 lines of code of method a is working now");
    }

    @Override
    public void b() {
        System.out.println("45 lines of code of method b is working now");
    }

    @Override
    public void e() {
        System.out.println("eeeeeeeeeee");
    }
}
