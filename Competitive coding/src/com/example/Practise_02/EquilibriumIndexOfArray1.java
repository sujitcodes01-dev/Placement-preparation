package com.example.Practise_02;

import java.util.Scanner;

public class EquilibriumIndexOfArray1 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int left  =  arr[0];
        int right = arr[n-1];
        for(int i=2; i<n-1; i++){
            right += arr[i];
        }

        for(int i=1; i<n-1; i++){
            if(left == right){
                System.out.println("Equilibrium index is "+i);
                return;
            }
            left += arr[i];
            right -= arr[i+1];
        }

        System.out.println("Equilibrium index is -1");

    }
}
