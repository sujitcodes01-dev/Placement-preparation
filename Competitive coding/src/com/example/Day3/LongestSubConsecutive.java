package com.example.Day3;

import java.util.Arrays;

public class LongestSubConsecutive {

    public static void main(String[] args) {
        int[] arr = {5, 4, 5, 1, 3, 2, 2, 3, 4};


        Arrays.sort(arr);

        int count = 1;
        int max = 0;

        for(int i =1; i<arr.length; i++){
            if(arr[i] - arr[i-1] == 1){
                count++;
                max = Math.max(count, max);
            }
            else{
                count =0;
            }
        }
        System.out.println(max);

    }

}
