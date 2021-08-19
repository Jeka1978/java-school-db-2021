package homework.lab3.infra;

import homework.lab3.heroes.*;
import homework.lab3.utils.RandomUtil;
import lombok.SneakyThrows;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ReflectionHeroFactory implements HeroFactory {


    private final List<Class<? extends Hero>> heroClasses =
            List.of(Elf.class, Hobbit.class, King.class, Knight.class);



    @SneakyThrows
    @Override
    public Hero createHero() {

        Class<? extends Hero> heroClass = RandomUtil.getRandomElement(heroClasses);

        Hero hero = heroClass.getDeclaredConstructor().newInstance();


        return hero;
    }
}
