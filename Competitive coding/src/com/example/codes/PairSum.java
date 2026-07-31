package com.example.codes;

public class PairSum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6};

        int target = 6;

        int sum =0;
        int n = arr.length;
        int i =0;

        while(i<n)
        {
            sum = arr[i] + arr[n-1];

            if(sum>target){
                n = n-1;
                sum = arr[i] + arr[n];
            }
            else if(sum<target){
                i++;
                sum = arr[i] + arr[n];
            }
            else if(target == sum){
                System.out.println("Target matched with index: " +i+ "; " +(n-1));
                break;
            }

        }

    }
}
