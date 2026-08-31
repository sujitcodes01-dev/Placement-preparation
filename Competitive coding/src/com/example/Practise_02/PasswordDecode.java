package com.example.Practise_02;

import java.util.Scanner;

public class PasswordDecode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the password: ");

        String s = sc.nextLine();

        StringBuilder str = new StringBuilder();

        int flag = 0;
        for(int i=1; i<s.length(); i++){

            char left = s.charAt(i-1);
            char current = s.charAt(i);

            if(flag == 0){
                if(Character.isLetter(left) && (!Character.isLetter(current))){
                    str.append(left);
                    str.append(current);
                    i++;
                    flag = 1;
                }
            }
            else{
                if((!Character.isLetter(left)) && Character.isLetter(current)){
                    str.append(left);
                    str.append(current);
                    i++;
                    flag = 0;
                }
            }
        }

        System.out.println("Decoded password: " +str);
    }
}
