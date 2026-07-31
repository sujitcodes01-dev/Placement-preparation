package com.example.Practise;

import java.util.Scanner;

public class MinimumDiscountItem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.MAX_VALUE;
        System.out.print("Enter the number of items: ");
        int N = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------");
        int[] arr = new int[N];
        String[] s = new String[N];
        System.out.print("Enter name, price, discount% of the item: ");
        for(int i =0; i<N; i++) {
            String input = sc.nextLine();
            String[] str = input.split(",");
            s[i] = str[0];
            int price = Integer.parseInt(str[1]);
            int disPercent = Integer.parseInt(str[2]);
            arr[i] = (disPercent*price)/100 ;
            if(arr[i]<=t){
                t=arr[i];
            }
        }

        System.out.println("Minimum discount item(s): ");
        for(int i=0; i<N; i++){
            if(arr[i]==t){
                System.out.println(s[i]);
            }
        }

    }
}
