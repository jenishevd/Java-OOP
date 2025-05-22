/*
Polymorphism

Types of Polymorphism
1. Compile Time / Static Polymorphism
Achieved via a method overloading(Same name but type, arguments, return types and ordering can be different.
Ex: multiple constructors)

2. Run-Time / Dynamic Polymorphism
Achieved by method Override
Like:   Parent obj = new Child();
Here, which method will be called depends on *new Child()*
This is know as upcasting.
That's all how Overriding works
 */

package Lesson3.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Shapes square1 = new Square();
        Square square2 = new Square();

        square1.area();
        square2.area();
    }
}
