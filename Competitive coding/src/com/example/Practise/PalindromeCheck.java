package com.example.Practise;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        if(i<0){
            System.out.println("INVALID INPUT");
            return;
        }
        String s1 = String.valueOf(i);
        if(s1.equals(new StringBuilder(s1).reverse().toString())){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT");
        }
    }
}
