package com.example.codes;

class Student
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class SingleInh extends Student {

    void display(){
        System.out.println("age: "+age+ " name: "+name);
    }

    public SingleInh(int age, String name) {
        super(age, name);
    }

    public static void main(String[] args) {
        SingleInh obj1 = new SingleInh(11, "sourav");
        obj1.display();
    }

}
