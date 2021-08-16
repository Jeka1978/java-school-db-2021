package com.db;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Start {


    public static void main(String[] args) throws InterruptedException {
        for (String arg : args) {
            System.out.println(arg);
        }


        List<Integer> integers = List.of(1, 2, 3);

        if ((((Math.sqrt(integers.size()) == 5.0)))){
            System.out.println("URA!");
        }


        for (Integer integer : integers) {
            System.out.println(integer);
        }


    }
}
