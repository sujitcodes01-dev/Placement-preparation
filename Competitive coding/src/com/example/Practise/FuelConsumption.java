package com.example.Practise;

import java.util.Scanner;

public class FuelConsumption {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fuel = sc.nextDouble();
        double distance = sc.nextDouble();

        if(fuel > 0 && distance > 0){
            double m1 = (fuel/distance) * 100;
            double m2 = (distance/fuel) * (0.6214/0.2642);

            System.out.printf("Litres/100 km: %.2f\n",+m1);
            System.out.printf("Miles/Gallons: %.2f",+m2);
        }
        else{
            if(fuel<0){
                System.out.println(fuel +" is invalid input");
            }
            else{
                System.out.println(distance +" is Invalid input");
            }
        }

    }
}
