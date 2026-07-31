package com.example.codes;

public class SlidingWindow {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};

        int max =0;
        int sum =0;
        int k=3;

        for(int i = 0; i<k ; i++){
            sum = sum + arr[i];
            max =sum;
        }

        int n =k;

        for(int j = 0; j< n; j++){
            sum = sum - arr[j] + arr[k];
            k=k+1;
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);

    }
}
