package com.example.Practise;

import java.util.Locale;
import java.util.Scanner;

public class MovieTicket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tickets: ");
        int n = sc.nextInt();

        if(!(n>=5 && n<=40)){
            System.out.println("Minimum 5 tickets and maximum 40 tickets...");
            return;
        }
        System.out.print("Do you have coupon code: ");
        String coupon = sc.next().toLowerCase();
        System.out.print("Do you want refreshment: ");
        String refreshment = sc.next().toLowerCase();
        System.out.println("Enter the circle(k/q): ");
        String circle = sc.next().toLowerCase();

        double total = 0;
        if(circle.equals("k")){
            total = 75*n;
        }
        else if(circle.equals("q")){
            total = 150*n;
        }
        else{
            System.out.println("Please enter a valid circle...");
            return;
        }

        if(n>20){
            total = total - 0.1*total;
        }
        if(coupon.equals("y")){
            total = total - (2*total)/100 ;
        }
        if(refreshment.equals("y")){
            total = total + 50*n;
        }
        System.out.printf("Total cost: %.2f",total);

    }
}
