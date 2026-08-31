package com.example.Practise_02;

import java.util.Scanner;

public class WrappedItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int count = 0;
        if(str.length() < 3){
            System.out.println("Number of wrapped Items: "+count);
            return;
        }

        for(int i=1; i<str.length()-1; i++){

            if(Character.isLowerCase(str.charAt(i))){
                char left = str.charAt(i-1);
                char right = str.charAt(i+1);
                if((left >= '0' && left <= '9') && (right >= '0' && right <= '9')){
                    count++;
                }
            }

        }
        System.out.println("Number of wrapped Items: "+count);
    }
}
