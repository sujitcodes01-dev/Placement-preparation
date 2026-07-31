package com.example.Practise;

import java.util.Arrays;

public class SecondSmallANDsecondLargest {

    public static void main(String[] args) {
        int[] arr = {7,3,9,0,1,4,5};

        Arrays.sort(arr);
        System.out.println("Second smallest: " +arr[1] + " Second largest: "+arr[arr.length-2]);
    }

}

