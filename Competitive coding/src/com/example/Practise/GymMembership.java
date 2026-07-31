package com.example.Practise;
import java.util.*;

public class GymMembership {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of months: ");
        int months =  sc.nextInt();

        if(months != 1 && months != 3 && months != 6 && months != 9 && months != 12){
            System.out.println("Inavlid input...");
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1,2000);
        map.put(3,5000);
        map.put(6,9000);
        map.put(9,12000);
        map.put(12,15000);

        for(Map.Entry<Integer, Integer> pair : map.entrySet()){
            if(pair.getKey() == months){
                System.out.println();
                System.out.print("The Membership fees is: "+pair.getValue());
            }
        }


    }
}
