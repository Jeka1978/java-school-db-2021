package homework.lab3.infra;

import homework.lab3.heroes.Hero;
import homework.lab3.utils.RandomUtil;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class SimpleHeroFactory implements HeroFactory {

    private List<HeroCreator> heroCreators = List.of(
            new HobbitCreator(), new ElfCreator());


    @Override
    public Hero createHero() {
        return RandomUtil.getRandomElement(heroCreators).create();
    }
}











