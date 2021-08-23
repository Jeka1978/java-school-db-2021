package homework.lab3.infra;

import homework.lab3.heroes.*;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class HeroFactoryWithJava8 implements HeroFactory {

    private List<Supplier<Hero>> suppliers = List.of(
            Hobbit::new,
            Elf::new,
            () -> new King(),
            () -> new Knight()
    );

    @Override
    public Hero createHero() {
        return null;
    }
}
