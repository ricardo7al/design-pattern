package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Jaguar jgr = new Jaguar(10, 120f);

        System.out.println("jgr = " + jgr);
        jgr.eat();
        jgr.sleep();
        jgr.roar();
        jgr.meow();
        jgr.hunt();


    }
}