package com.example.codes;

class College
{
    String collgName;
    String course;

    public College(String name, String course) {
        this.collgName = name;
        this.course = course;
    }
}

class Teacher extends College
{
    String teacherName;
    String subject;

    public Teacher(String name, String collgName, String course, String subject) {
        super(collgName, course);
        this.teacherName = name;
        this.subject = subject;
    }
}

public class Students extends Teacher {

    String studentName;
    int roll;

    public Students(String name, int roll, String teacherName, String collgName, String course, String subject) {

        super(teacherName, collgName, course, subject);

        this.studentName = name;
        this.roll = roll;
    }

    void display() {
        System.out.println("student name: " + studentName + "; Student roll: " + roll);
        System.out.println("Teacher name: " + teacherName + "; Subject: " + subject);
        System.out.println("College name: " + collgName + "; Course: " + course);
    }

    public static void main(String[] args) {

        Students obj1 = new Students(
                "sourav",
                50,
                "Rahul Shrama",
                "AEC",
                "AIML",
                "java"
        );

        obj1.display();
    }
}