package com.example.Practise;

import java.util.Scanner;

public class ValueToAscii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        String str = sc.nextLine();
        String[] temp = str.split(",");
        if(temp.length!=4){
            System.out.println("Please enter 4 values");
        }
        for(String i : temp){
            int t = Integer.parseInt(i);
            System.out.println(i+" --> "+(char)t);
        }
    }
}
