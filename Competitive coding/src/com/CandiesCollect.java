package com.example.CodeWithSujit_1;

import java.util.Arrays;
import java.util.Scanner;

public class CandiesCollect {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the Number of boxes: ");
        int n = sc.nextInt();

        int[] boxes = new int[n];

        System.out.println("Enter the number of candies per box: ");
        for (int i=0; i<n; i++){
            boxes[i] = sc.nextInt();
        }

        Arrays.sort(boxes);

        int time = boxes[0] + boxes[1];
        int minTime = time;
        for(int i=2; i<n; i++){
            time = time + boxes[i];
            minTime += time;
        }

        System.out.println("Minimum time: "+minTime);
    }
}
