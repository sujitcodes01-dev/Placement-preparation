package com.example.Practise_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LengthOfLongestPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        int length = 0;
        boolean flag = false;

        for(Map.Entry<Character, Integer> set : map.entrySet()){
            int count = set.getValue();
            if(count %  2 == 0){
                length += count;
            }
            else{
                length += count - 1;
                flag = true;
            }
        }

        if(flag){
            length += 1;
        }

        System.out.println("Longest palindrome's length is: "+length);
    }

}
