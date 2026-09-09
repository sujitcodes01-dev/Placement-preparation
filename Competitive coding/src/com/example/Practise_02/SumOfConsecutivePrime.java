package com.example.Practise_02;

import java.util.Scanner;

public class SumOfConsecutivePrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        int sum = 2;
        int count = 0;

        for(int i=3; i<=range; i++){
            boolean flag = isPrime(i);

            if(flag){
                sum +=i;
                if(sum <= range && isPrime(sum)){
                    count++;
                }
            }

        }
        System.out.println("Number of sum of consecutive prime numbers is "+count);

    }

    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
