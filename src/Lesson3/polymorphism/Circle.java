package Lesson3.polymorphism;

public class Circle extends Shapes {
    // this will run when obj is created
    // hence it is overriding the parent method
    @Override // its called annotation
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
