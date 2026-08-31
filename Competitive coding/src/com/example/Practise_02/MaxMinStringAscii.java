package com.example.Practise_02;

import java.util.Scanner;

public class MaxMinStringAscii {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int N = Integer.parseInt(sc.nextLine());

        String[] words = new String[N];

        String str = sc.nextLine();

        words = str.split(",");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int maxIndex = 0;
        int minIndex = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<words[i].length(); j++) {
                sum += words[i].charAt(j);
            }
            if(sum > max){
                maxIndex = i;
            }else if(sum < min){
                minIndex = i;
            }
        }
        System.out.println(words[maxIndex] +" "+ words[minIndex]);
    }
}
