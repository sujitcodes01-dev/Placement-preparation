package com.example.Practise_02;

import java.util.Scanner;

public class MaxHorseBet_slidingWindow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of horses: ");
        int n = sc.nextInt();

        System.out.print("Enter the wining price: ");
        int prize = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the cost of each horse: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        findMaxHorses(arr, prize);

    }


    public static void findMaxHorses(int[] arr, int prize){
        int left  = 0;
        int sum = 0;
        int max = 0;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            count++;

            while(sum>=prize){
                sum -= arr[left];
                left++;
                count--;
            }
        }

        System.out.println("Maximum number of consecutive horses for betting: "+count);
    }
}
