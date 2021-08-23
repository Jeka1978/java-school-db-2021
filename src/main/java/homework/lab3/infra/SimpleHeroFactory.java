package homework.lab3.infra;

import com.db.model.Person;
import homework.lab3.heroes.Hero;
import homework.lab3.utils.RandomUtil;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class SimpleHeroFactory implements HeroFactory {

    {
        List.of(new Person())
                .stream()
                .filter(person -> person.getSalary()<10)
                .filter(person -> person.getName().startsWith("A"))
                .map(Person::getName)
                .map(String::length)
                .forEach(System.out::println);

    }

    private List<HeroCreator> heroCreators = List.of(
            new HobbitCreator(), new ElfCreator());


    @Override
    public Hero createHero() {
        return RandomUtil.getRandomElement(heroCreators).create();
    }
}











