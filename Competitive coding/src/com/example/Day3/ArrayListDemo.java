package com.example.Day3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Ankit");
        students.add("Priya");

        System.out.println(students.get(1));

        students.set(1, "Rohan");

        students.remove(2);

        Collections.sort(students);

        for (String i : students){
            System.out.println(i);
        }

    }
}
