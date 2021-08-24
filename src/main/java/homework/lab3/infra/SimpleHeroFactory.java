package homework.lab3.infra;

import com.db.model.Person;
import homework.lab3.heroes.Hero;
import homework.lab3.utils.RandomUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class SimpleHeroFactory implements HeroFactory {


    public static void main(String[] args) {
        IntStream.iterate(1,i ->i+1 ).peek(System.out::println).limit(100).max();
    }

    {

        Stream<Integer> stream = Stream.of(1, 2, 3);



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











