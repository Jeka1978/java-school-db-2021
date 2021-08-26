package my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */

public final class CleanerImpl implements Cleaner {

    @InjectRandomInt(min = 3, max = 5)
    private int repeat;


    @PostConstruct
    public void init() {
        System.out.println("repeat = " + repeat);
    }

    @Override
    @Benchmark
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVvvvvvvvvvvvvvvvvv");
        }
    }
}
