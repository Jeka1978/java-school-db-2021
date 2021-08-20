package design_patterns.strategy;

/**
 * @author Evgeny Borisov
 */
public class AlarmImpl implements Alarm {
    @Override
    public void c() {
        System.out.println("40 lines of code of method c is working now");
    }

    @Override
    public void d() {
        System.out.println("40 lines of code of method d is working now");
    }

    @Override
    public void e() {
        System.out.println("EEEEEEEEEEEE");
    }
}
