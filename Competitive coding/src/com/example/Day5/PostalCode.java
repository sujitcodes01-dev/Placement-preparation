package com.example.Day5;

import java.util.HashSet;
import java.util.Set;

public class PostalCode {

    public static void main(String[] args) {

        String s = "5660001";

        if(s.length()>6){
            System.out.println("NOT A POSTAL CODE");
            return;
        }


        if(s.startsWith("0")){
            System.out.println("Not a postal code");
            return;
        }


        Set<Character> set = new HashSet<>(Set.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));


        int count = 0;

        for(int i = 0 ; i<s.length()-2; i++){
            if(s.charAt(i) == s.charAt(i+2)){
                count++;
                if(count>1){
                    System.out.println("NOT a postal code");
                    return;
                }
            }

            if(!set.contains(s.charAt(i))){
                System.out.println("NOT a postal code");
                return;
            }

        }
        for(int i = s.length()-1; i<s.length()-3; i--){
            if(!set.contains(s.charAt(i))){
                System.out.println("NOT a postal code");
                return;
            }
        }

        System.out.println("postal code");




    }



}
