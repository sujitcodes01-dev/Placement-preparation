package com.example.Day3;

import java.util.HashSet;

public class FirstRepeatElement {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3,  5, 6};

        HashSet<Integer> numbers = new HashSet<>();

        for(int i : arr){
            if(!numbers.contains(i)){
                numbers.add(i);
            }
            else if(numbers.contains(i)){
                System.out.println(i);
                return;
            }
        }
        System.out.println("No DUPLICATE");
    }

}
