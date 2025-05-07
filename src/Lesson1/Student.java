/*
    Introduction & Concepts - Classes, Objects, Constructors, Keywords


 */
package Lesson1;

public class Student {
    int rno;
    String name;
    float marks = 99.3f;

    void greeting(){
        System.out.println("Hello! My name is " + this.name);
        System.out.println("My grade is " + this.marks);
    }

    void changeName(String newName){
        this.name = newName;
    }

    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student() {
        this (13, "default person", 100);
//        this.rno = 1;
//        this.name = "Basic Student";
//        this.marks = 50;
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
