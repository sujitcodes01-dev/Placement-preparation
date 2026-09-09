package com.example.Practise_02;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MaxHorseBet_Deque {

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

    public static void findMaxHorses(int[] arr, int  prize){
        Deque<Integer> dq = new ArrayDeque<>();

        int count = 0;
        int sum = 0;
        int max = 0;

        for(int x :  arr){
            dq.add(x);
            sum += x;
            count++;

            while(sum >= prize){
                sum -= dq.removeFirst();
                count--;
            }
        }

        System.out.println("maximum number of Horses for betting: "+count);
    }
}
