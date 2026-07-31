package com.example.Practise;

public class SmallestNumber {
    public static void main(String s[]){
        int[] arr = {1,3,7,-9,4};
        int small = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < small){
                small = arr[i];
            }
        }
        System.out.println("Smallest number: "+small);
    }
}
