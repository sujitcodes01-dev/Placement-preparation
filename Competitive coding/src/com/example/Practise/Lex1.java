package com.example.Practise;
import java.util.*;

public class Lex1 {

    public static void comparison(String s1, String s2){
        if(s1.compareTo(s2) <= -1){
            System.out.println(s1 +" is lexicographically smaller than "+s2);
        }
        else{
            System.out.println(s2 +" is lexicographically smaller than "+s1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Strings: ");
        String a = sc.nextLine();
        String b = sc.nextLine();

        comparison(a,b);
    }
}
