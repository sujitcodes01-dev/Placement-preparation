package com.example.Practise_02;

import java.util.Scanner;

public class SecondHighestElement {

    public static int findSecondHighest(int[] arr, int n){
        int secondHighest = 0;
        int highest = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] > highest){
                secondHighest = highest;
                highest = arr[i];
            }
            else if(arr[i]>secondHighest && arr[i]<highest){
                secondHighest = arr[i];
            }
        }
        return secondHighest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        if(n<2){
            System.out.print("Second highest element does not exist");
        }
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int output = findSecondHighest(arr, n);
        System.out.println("Second Highest element is: "+output);


    }
}
