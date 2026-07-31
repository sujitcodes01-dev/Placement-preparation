package com.example.Day3;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 25, 25, 25, 25);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("----------");

        numbers.stream()
                .distinct()
                .forEach(System.out::println);

    }
}
