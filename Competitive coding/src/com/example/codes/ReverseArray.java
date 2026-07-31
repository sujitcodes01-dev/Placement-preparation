package com.example.codes;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int n = arr.length - 1;
        int k;
        for(int i =0; i<n; i++){
            k = arr[n];
            arr[n] = arr[i];
            arr[i] = k;
            n--;
        }

        for(int i:arr){
            System.out.println(i);
        }
    }
}
