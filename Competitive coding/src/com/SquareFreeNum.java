package com.example.CodeWithSujit_1;

import java.util.ArrayList;
import java.util.Scanner;

public class SquareFreeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=num; i++){
            if(num % i == 0){

                boolean squareFree = true;

                for(int j=2; j<=Math.sqrt(i); j++){
                    if(i % (j*j) == 0){
                        squareFree = false;
                        break;
                    }
                }

                if(squareFree){
                    list.add(i);
                }
            }
        }
        System.out.println(list);
    }
}
