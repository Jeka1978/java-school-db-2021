package com.db.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

import static java.lang.Math.*;

/**
 * @author Evgeny Borisov
 */

@Setter
@EqualsAndHashCode(exclude = "id")
public class Person extends Object {

    @Getter
    private static int counter;

    public static int number = new Random().nextInt(12);
    private int id;
    private double age;
    private String name;
    private double salary;




    public Person() {
        System.out.println("Я лунтик, и я родился");
    }

    public Person(double age) {
        this.age = age;
    }

    {
        counter++;
        System.out.println("я инитиалайзер");
    }

    static {
        System.out.println("Я статик");
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("как не хочется умирать...");
    }

    public static void main(String[] args) {
        sin(cos(sqrt(12)));
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }
}
