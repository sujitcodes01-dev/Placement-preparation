package com.example.codes;

public class PrefixSum {

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 7, 3};

        int L = 0, R =3;
        int sum = 0;

        int[] prefix = new int[arr.length];

        int j=0;
        for(int i : arr){
            sum = sum + i;
            prefix[j] = sum;
            j++;
        }

        if(L==0){
            System.out.println(prefix[R]);
        }
        else{
            System.out.println(prefix[R] - prefix[L-1]);
        }

    }
}


//logic for the program:-
//
// int L =1, R =3;
//int sum;
//if(L ==0)
//    sum = prefix[R];
//else
//    sum = prefix[R] - prefix[L-1];
//System.out.println(sum);
