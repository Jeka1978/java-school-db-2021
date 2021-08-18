package com.db.model;

/**
 * @author Evgeny Borisov
 */
public class Son extends Father {

    public Son(int age) {
     super(age);
    }




    @Override
    public void drink() {
        super.drink();
        System.out.println("Я люблю пиво");
        super.drink();

    }
}
