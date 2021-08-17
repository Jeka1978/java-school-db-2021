package object_casting;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal {

    public static void gav(){}

    @Override
    public void speak() {
        System.out.println("gav gav");
    }

    public void дайПалку(){
        System.out.println("достал ты со своей палкой");
    }
}
