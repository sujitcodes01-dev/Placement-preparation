package com.example.Day2;

public class CoinSelection {

    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50};

        int amount = 69;
        int n = 0;

        int i = 5;
        while(amount !=  0){
            if(amount >= coins[i]){
                n = n + amount/coins[i];
                amount = amount % coins[i];
            }
            else{
                i--;
            }
        }

        System.out.println("Number of Coins: " +n);
    }

}


//it is a greedy algo which fails in few cases to give the minimum number of coins required for an amount
