package com.example.CodeWithSujit_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashSet;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the Kth value: ");
        int k = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        int i = 1;
        while(i<=n){

            if(n % i == 0){
                list.add(i);
            }
            i++;

        }

        Collections.sort(list);

        if(list.size() < k){
            System.out.println("The "+k+"th factor of "+n+" is: 1");
            return;
        }

        System.out.println("The "+k+"th factor of "+n+" is: "+list.get(list.size()-k));
    }
}
