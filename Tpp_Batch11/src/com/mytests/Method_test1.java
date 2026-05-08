package com.mytests;

public class Method_test1 {

    static void sayHello() {
        System.out.println("Hello!");
    }
    static void sayHello(String name){
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        sayHello();
        sayHello("Shin");
    }
}

