package com.example.Practise;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b>a && a>=0 && b>0){
            while(b>=a){
                int flag = 0;
                for(int i=2; i<=a/2; i++){
                    if(a%i==0){
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0){
                    System.out.println(a);
                }
                a++;
            }
        }
        else{
            System.out.println("INVALID input");
        }

    }
}
