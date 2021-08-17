package com.db.model;

import lombok.Getter;

/**
 * @author Evgeny Borisov
 */
public class Father {
    @Getter
    private int age;

    public void drink(){
        System.out.println("Я люблю Виски");
    }



    public Father(int age) {
        System.out.println(age);
        this.age=age;
    }

    public Father(String str) {

    }

}
