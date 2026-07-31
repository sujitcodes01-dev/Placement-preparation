package com.example.codes;

abstract class Human
{
    abstract void work();
}

public class Abs extends Human {

    @Override
    void work() {
        System.out.println("Implemented abstract class...");
    }

    public static void main(String[] args) {
        Abs a = new Abs();
        a.work();
    }
}
