package com.talent.batch11.day2.inclass;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Method_One {

    public static void main(String[] args) {

        eat();
        int myAge = calculateAge(1999);
        System.out.println("I am" + myAge + "years old");

    }

    static void eat() {
        System.out.println("I am eating now!");
    }

    static void sleep() {
        System.out.println("I am sleeping now!");
    }

    static void study() {
        System.out.println("I am studying now!");
    }

    static void code() {
        System.out.println("I am coding now!");
    }

    static void play() {
        System.out.println("I am playing now!");
    }

    static int calculateAge(int birthYear){
        int currentYear = LocalDateTime.now().getYear();
        return currentYear-birthYear;
    }


}
