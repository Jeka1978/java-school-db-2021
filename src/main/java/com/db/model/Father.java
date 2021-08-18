package com.db.model;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * @author Evgeny Borisov
 */
public class Father {
    @Getter
    private int age;

    public void drink(){
        System.out.println("Я люблю Виски");
    }


    public void calculate(BigDecimal d) {
        System.out.println(d.longValue()*2);
    }


    public Father(int age) {
        System.out.println(age);
        this.age=age;
    }

    public Father(String str) {

    }

}
