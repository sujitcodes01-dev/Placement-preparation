package com.example.Practise;
import java.util.*;

public class UsingHashSet {

    public static void main(String[] args) {
        int[] arr = {0, 6, 4, 6, 0};


        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }

        System.out.println(map);

        int[] freq = new int[map.size()];

        int i =0;
        for(int v : map.values()){
            freq[i] = v;
            i++;
        }

        System.out.println(map.get(4));


        for(int f:freq){
            System.out.print(f+" ");
        }

        System.out.println("------");
        for(int k : map.keySet()){
            System.out.print(k+" ");
        }
    }

}
