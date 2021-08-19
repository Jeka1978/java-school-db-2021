package homework.lab3.infra;

import homework.lab3.heroes.Hero;
import homework.lab3.heroes.Hobbit;

/**
 * @author Evgeny Borisov
 */
public class HobbitCreator implements HeroCreator {
    @Override
    public Hero create() {
        return new Hobbit();

    }
}
