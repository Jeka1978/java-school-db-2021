package my_spring;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkCleanerImplWrapper implements Cleaner { //or extends CleanerImpl

    @InjectByType
    private CleanerImpl cleaner;

    @Override
    public void clean() {
        long start = System.nanoTime();
        cleaner.clean();
        long end = System.nanoTime();
        System.out.println(end-start);
    }
}
