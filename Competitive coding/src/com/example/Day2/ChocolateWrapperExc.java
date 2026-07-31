package com.example.Day2;

public class ChocolateWrapperExc {

    public static int countWrappers(int amount, int cost, int exchange){
        int wrapper = amount;
        int count = amount/cost;

        while(wrapper>=3){
            count = count + wrapper/3;
            wrapper = wrapper % 3 + wrapper/3;
        }
        System.out.println("Number of chocolates: " +count);
        return count;
    }

    public static void main(String[] args) {
        int money = 18;
        int cost = 1;
        int exchange = 3;

        countWrappers(money, cost, exchange);
    }

}
