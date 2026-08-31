package com.example.Practise;

import java.util.HashMap;
import java.util.Scanner;

public class ExpandedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            if(!map.containsKey(temp)){
                map.put(temp,i+1);
            }
        }
        System.out.println(map);

        giveExpandedString(map,s);
    }

    public static void giveExpandedString(HashMap<Character, Integer> map, String s){
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int x = map.get(c);
            for(int j=0; j<x;  j++){
                System.out.print(c);
            }
            if(i!=s.length()-1){
                System.out.print("-");
            }

        }
    }
}
