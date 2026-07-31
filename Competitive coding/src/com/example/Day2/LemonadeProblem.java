package com.example.Day2;

public class LemonadeProblem {

    public static void main(String[] args) {

        int five = 0, ten = 0;

        int arr[] = {5,5,5,10,20};

        int i = 0;

        while(i<arr.length){
            if(arr[i] == 5 ){
                five++;
                i++;
            }
            else if(arr[i] == 10 && five>0){
                ten++;
                five--;
                i++;
            }
            else if(arr[i] == 20){
                if(ten>0 && five >0){
                    ten--;
                    five--;
                    i++;
                }
                else if(five>2){
                    five = five -3;
                    i++;
                }
                else{
                    System.out.println("FALSE");
                    break;
                }
            }
            else{
                System.out.println("FALSE");
                break;
            }
        }
        if(i==arr.length)
            System.out.println("TRUE");

    }
}
