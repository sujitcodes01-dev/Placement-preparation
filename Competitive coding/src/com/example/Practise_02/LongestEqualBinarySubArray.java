package com.example.Practise_02;

import java.util.Scanner;

public class LongestEqualBinarySubArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] binaryArray = new int[size];
        System.out.print("Enter the elements: ");
        for(int i=0; i<size; i++){
            binaryArray[i]=sc.nextInt();
        }

        findLongestSubArray(binaryArray, size);

    }


    public static void findLongestSubArray(int[] arr, int n){
        int one = 0;
        int zero = 0;
        int result = 0 ;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                zero += 1;
            }
            else{
                one += 1;
            }

            if(one == zero){
                result = one + zero ;
            }
        }
        System.out.println("Longest Binary sub array is " + result);
    }
}
