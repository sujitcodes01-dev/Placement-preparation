package com.example.Day3;

@FunctionalInterface
public interface LambdaExpresn {
    void display();
}
class A
{
    public static void main(String[] args) {
        LambdaExpresn l1 = () -> System.out.println("Hello");
        l1.display();

        LambdaExpresn l2 = () -> System.out.println("world");
        l2.display();
    }
}