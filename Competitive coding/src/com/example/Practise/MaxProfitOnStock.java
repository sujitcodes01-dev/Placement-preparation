package com.example.Practise;

import java.util.Scanner;

public class MaxProfitOnStock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of days: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.print("Enter the stock values with space separated: ");
        String s = sc.nextLine();

        int[] arr = new int[n];

        String[] str = s.split(" ");

        for(int i=0 ; i< n; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        int current = 0;
        int maxProfit = 0;
        for(int i=1; i<n; i++){
            current = arr[i] - arr[i-1];
            if(maxProfit < current){
                maxProfit = current;
            }
        }

        System.out.println(maxProfit);

    }

}
