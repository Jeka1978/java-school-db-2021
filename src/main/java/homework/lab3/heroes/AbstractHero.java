package homework.lab3.heroes;

import homework.lab3.utils.RandomUtil;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public abstract class AbstractHero implements Hero {

    private int hp;
    private int power;
    private final String name;

    public AbstractHero() {
        this.name = RandomUtil.randomName();
    }

    @Override
    public void decreasePower(int delta) {
        this.power -= delta;
    }

    @Override
    public void decreaseHp(int delta) {
        this.hp -= delta;
    }

    @Override
    public void die() {
        hp = 0;
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " name= " + name + " hp=" + hp;
    }


}
