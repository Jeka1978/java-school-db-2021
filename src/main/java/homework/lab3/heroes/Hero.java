package homework.lab3.heroes;

/**
 * @author Evgeny Borisov
 */
public interface Hero {
    int kick(Hero enemy);
    int getHp();
    int getPower();
    String getName();
    boolean isAlive();
    void setHp(int hp);
    void setPower(int power);

    void decreasePower(int delta);
    void decreaseHp(int delta);

    void die();

}
