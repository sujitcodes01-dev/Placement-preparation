package com.example.Practise;
import java.util.*;

public class ReplaceWithRank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        LinkedList<Integer> list = new LinkedList<>();

        for(int i =0; i<n; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);


        for(int i=0; i<n; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (arr[i] == list.get(j)) {
                    arr[i] = j + 1;
                }
            }
        }

        System.out.println("The Rank is: ");
        for(int i=0;  i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }

}
