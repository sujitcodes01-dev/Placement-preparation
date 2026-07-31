package com.example.Day3;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); //duplicate
        fruits.add("apple");

        System.out.println(fruits);

        System.out.println("------------------------------");

        if(fruits.contains("Banana")){
            System.out.println("Banana Exists");
        }

        System.out.println("--------------------------------");

        fruits.remove("Apple");

        System.out.println(fruits);
    }
}
