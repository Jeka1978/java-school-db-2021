package homework.lab3.heroes;

/**
 * @author Evgeny Borisov
 */
public class Hobbit extends AbstractHero {

    public Hobbit() {
        setHp(3);
        setPower(0);
    }

    @Override
    public int kick(Hero enemy) {
        cry();
        return 0;
    }

    private void cry() {
        System.out.println("ааааааааааааааааааааааууууууууууууууууу");

    }

}
