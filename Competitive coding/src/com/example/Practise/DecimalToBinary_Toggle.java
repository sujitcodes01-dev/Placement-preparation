package com.example.Practise;

import java.util.Scanner;

public class DecimalToBinary_Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal value: ");
        int decimalNum = sc.nextInt();

        StringBuilder  binaryNum = new StringBuilder(Integer.toBinaryString(decimalNum));

        System.out.println(binaryNum);

        for(int i =0; i<binaryNum.length(); i++){
            if(binaryNum.charAt(i) == '0'){
                binaryNum.setCharAt(i, '1');
            }
            else{
                binaryNum.setCharAt(i,'0');
            }
        }

        int j = binaryNum.length()-1 ;
        double output = 0;

        for(int i =0; i<binaryNum.length(); i++){
            if(binaryNum.charAt(j) == '1'){
                output = Math.pow(2, i) + output;
            }
            j--;
        }

        System.out.println("Output is: " +(int)output);

    }
}
