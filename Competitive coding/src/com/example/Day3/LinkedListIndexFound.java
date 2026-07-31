package com.example.Day3;

import java.util.LinkedList;

public class LinkedListIndexFound {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.addFirst(5);
        numbers.addLast(30);

        for(int i : numbers){
            System.out.println(i);
        }

    }

}
