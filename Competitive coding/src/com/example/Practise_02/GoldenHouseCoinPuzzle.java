package com.example.Practise_02;

import java.util.Scanner;

public class GoldenHouseCoinPuzzle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of rooms in the house: ");
        int rooms = sc.nextInt();

        int[] house = new int[rooms];

        System.out.println("Enter the required amount: ");
        int amount = sc.nextInt();

        System.out.println("Enter the coins value in the rooms: ");
        for(int i=0; i<rooms; i++){
            house[i] = sc.nextInt();
        }

        puzzleSolution(house, amount);

    }

    public static void puzzleSolution(int[] house, int amount){

        int left = 0;
        int sum = 0;
        for(int i=0; i<house.length; i++){
            sum += house[i];

            while(sum > amount){
                sum -= house[left];
                left++;
            }

            if(sum == amount){
                System.out.println(left+1 +"  "+(i+1));
                return;
            }
        }
    }
}
