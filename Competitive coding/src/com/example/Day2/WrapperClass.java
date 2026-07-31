package com.example.Day2;

public class WrapperClass {

    public static void main(String[] args) {
        int number = 100;

        //Autoboxing
        Integer obj = number;

        System.out.println("Primitive value: "+number);
        System.out.println("Autoboxing Integer object) : " + obj);
        
        //Unboxing
        Integer value = 200;
        int num = value;

        System.out.println("Wrapper object: " +value);
        System.out.println("Unboxing (primitive value): " +num);
    }
}
