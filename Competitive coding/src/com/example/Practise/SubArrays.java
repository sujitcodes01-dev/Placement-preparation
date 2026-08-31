package com.example.Practise;

import java.util.Scanner;

public class SubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int x = findSubArrays(arr, n);
        System.out.println("----------------------------------------------------------");
        System.out.println("Number of subArrays: "+x);
    }

    private static int findSubArrays(int[] arr, int n) {
        int j=0;
        for(int i =1; i<n-1; i++){
            if(arr[i-1]+arr[i+1]==arr[i]){
                j++;
            }
        }
        return j;
    }
}
