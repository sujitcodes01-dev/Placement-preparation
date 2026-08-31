package com.example.Practise_02;

import java.util.Scanner;

public class KeyLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value given by keyLogger: ");
        String code = sc.nextLine();
        int n = code.length();
        for(int i=0; i<code.length(); i++){
            for(int j=0; j<n; j++){

            }
        }

    }
    public static int charToInt(char c){
        int x = c - 96;
        return x;
    }
}
