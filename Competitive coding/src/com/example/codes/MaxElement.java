package com.example.codes;

public class MaxElement {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 34, 67};

        int m= 0;

        for(int i : arr){
            m = Math.max(i, m);
        }

        System.out.println("Maximum element:" +m);

    }



}
