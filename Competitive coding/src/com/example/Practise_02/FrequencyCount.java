package com.example.Practise_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

//        for(Map.Entry<Character, Integer> set : map.entrySet()){
//            System.out.println(set.getKey() +":"+ set.getValue());
//        }

        map.forEach((key, value)->{
            System.out.println(key + ":" + value);
        });
    }
}
