package com.example.codes;

class Parent
{
    String name;

    public Parent(String name) {
        this.name = name;
    }

}

class Accounts extends Parent
{
    int balance;

    public Accounts(String name, int balance) {
        super(name);
        this.balance = balance;
    }

    void display(){
        System.out.println("Parent name: "+name+ "; Balance: "+balance);
    }

}

public class Hierarchial extends Parent{

    String id;

    public Hierarchial(String name, String id) {
        super(name);
        this.id = id;
    }

    void display(){
        System.out.println("Parent name: "+name+ "; Id: "+id);
    }

    public static void main(String[] args) {
        Hierarchial obj1 =  new Hierarchial("Sourav","sourav@12");
        obj1.display();
        Accounts obj = new Accounts("Sujit", 100000);
        obj.display();
    }
}
