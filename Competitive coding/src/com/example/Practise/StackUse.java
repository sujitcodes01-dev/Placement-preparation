package com.example.Practise;

import java.util.ArrayList;
import java.util.Scanner;


public class StackUse {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Input: ");
        String input = sc.nextLine();
        String[] str = input.split(",");

        for(String s: str){
            if(s.startsWith("ENTER")){

                String[] parts = s.split(" ");
                list.add(parts[1]);
                System.out.println(list.getLast()+" is added to parking...");

            }
            else if(s.equals("POP")){
                if(!list.isEmpty()) {
                    System.out.println(list.getLast() + " is removed from parking...");
                    list.remove(list.getLast());
                }
                else{
                    System.out.println("No More Vehicle is parked...");
                }
            }
            else if(s.equals("PEAK")){
                System.out.println(list.getLast()+" is the last parking...");
            }
            else{
                System.out.println("Number of vehicles parked is: "+list.size());
            }
        }
    }
}
