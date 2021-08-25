package design_patterns.singleton_anti_pattern;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class RussianNdsResolver implements NdsResolver {


    private double nds;

    public RussianNdsResolver() {
        nds  = getFromServer();
    }

    @SneakyThrows
    private double getFromServer()  {
        Thread.sleep(5000);
        return 0.19;

    }

    @Override
    public double getNds() {
        return nds;
    }
}





