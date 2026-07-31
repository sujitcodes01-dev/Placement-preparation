package com.example.Day2;

public class AnagramCheck {

    public static boolean isAnagaram(String s, String t){

        if(s.length() != t.length() ){
            System.out.println("NOT an ANAGRAM");
            return false;
        }

        int[] freq = new int[26];

        for(int i =0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int f : freq){
            if(f != 0){
                System.out.println("NOT an ANAGRAM");
                return false;
            }
        }
        System.out.println("ANAGRAM");
        return true;
    }

    public static void main(String[] args) {
        String s = "silent";
        String t = "listen";

        isAnagaram(s,t);
    }

}
