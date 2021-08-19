package homework.lab3.heroes;

/**
 * @author Evgeny Borisov
 */
public class Elf extends AbstractHero {

    public Elf() {
        setHp(10);
        setPower(10);
    }

    @Override
    public int kick(Hero enemy) {
        if (enemy.getPower() < this.getPower()) {
            int damage = enemy.getHp();
            enemy.die();
            return damage;
        } else {
            enemy.decreasePower(1);
            return 0;
        }
    }
}
