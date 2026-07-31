package com.example.Practise;

import java.util.*;

public class Main{

    public static List<Integer> kaprekarNumbers(int p, int q){
        List<Integer> list= new ArrayList<>();

        for(int i=p; i<=q; i++){
            int x = i*i;

            if(x==1){
                list.add(1);
            }
            else{
                String str = String.valueOf(x);
                int n = str.length()/2;
                String str1 = str.substring(0, n);
                String str2 = str.substring(n);
                int left = str1.isEmpty() ? 0 : Integer.parseInt(str1);
                int right = str2.isEmpty() ? 0: Integer.parseInt(str2);
                int sum = left + right;
                if(sum == i){
                    list.add(i);
                }
            }

        }
        return list;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int q = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        result = kaprekarNumbers(p, q);

        System.out.print(result);

    }

}
