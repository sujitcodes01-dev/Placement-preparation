package com.example.Practise;

import java.util.*;

public class DecimalToRoman{
    public static void main(String s[]){
        int[] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] str ={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        String result = "";
        if(num == 0){
            System.out.println("Invalid Input");
            return;
        }

        for(int i =0; i<arr.length; i++){
            while(num>=arr[i]){
                result = result + str[i];
                num = num - arr[i];
            }
            if(num == 0){
                System.out.println("Roman: "+result);
                return;
            }
        }
    }
}