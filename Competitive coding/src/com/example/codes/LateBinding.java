package com.example.codes;

class Demo
{
    public void display(){
        System.out.println("Hello");
    }
}

public class LateBinding extends  Demo{
    public void Display(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        LateBinding l = new LateBinding();
        l.display();
    }
}
