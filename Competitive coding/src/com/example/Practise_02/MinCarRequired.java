package com.example.Practise_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinCarRequired {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Groups in the trip: ");
        int groups =  sc.nextInt();

        int[] members = new int[groups];

        int[] carCapacity = new int[groups];

        System.out.print("Enter the number of members in each group: ");
        for(int i=0; i<groups; i++){
            members[i] = sc.nextInt();
        }

        System.out.print("Enter the capacity of members in each group car: ");
        for(int i=0;  i<groups; i++){
            carCapacity[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        int  count = 0;

        for(int i=0; i<groups; i++){
            if(members[i] > 2){
                list.add(members[i]);
                count += members[i];
            }
        }

        if(count==0){
            System.out.println("No one is  ready for trip..");
            return;
        }

        Collections.sort(list, Collections.reverseOrder());

        int cars = 0;

        for(int i:list){
            if(count == 0){
                System.out.println("Number of cars required: "+cars);
            }
            else{
                count -= i ;
                cars++;
            }
        }
        System.out.println("Number of cars required: "+cars);
    }
}
