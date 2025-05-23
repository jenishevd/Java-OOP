/*

Inheritance is a mechanism where one class(subclass or child class)
inherits the Lesson3.properties and methods of another class(superclass or parent class)

Types of inheritance:
- Single inheritance - One class extends another class
- Multilevel inheritance - One class can inherit from derived class. And the derived
class will become a parent class for another new class. Box => Box Weight => Box Price
- Hierarchical Inheritance - Multiple classes inherit from the same superclass
- Multiple Inheritance - A class implements multiple interfaces
- Hybrid Inheritance - A combination of more than one type of Inheritance
 */


package Lesson3;

public class Inheritance {}

class Box{
    // if private - access only in same class.it cannot be used in child class
    double l;
    double h;
    double w;


    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
        // super();     Object class
        this.w = side;
        this.l = side;
        this.h = side;
        System.out.println("Box class constructor");
    }

    public Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
        System.out.println("Box class constructor");
    }
    Box(Box old) {
        this.w = old.w;
        this.l = old.l;
        this.h = old.h;
    }

    public void information() {
        System.out.println("Running the box");
    }
    void greeting(){
        System.out.println("Hey! I am in Box class.");
    }
}

class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    //@Override         it is not possible to override statics
    void greeting(){
        System.out.println("Hey! I am in BoxWeight class.");
    }

    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
        System.out.println("Running the box weight");
    }

    public BoxWeight(double l, double h, double w, double weight){
        super(l, h, w); // super means - call the parent class constructor
        // used to initialise values present in parent class

        this.weight = weight;
        System.out.println(super.w);
    }

}

class BoxPrice extends BoxWeight{
    double price;

    BoxPrice() {
        super();
        this.price = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }

    public BoxPrice(double l, double h, double w, double weight, double price){
        super(l, h, w, weight);
        this.price = price;
    }

    public BoxPrice(double side, double weight, double price){
        super(side, weight);
        this.price = price;
    }
}



class Lesson{
    String name;
    String surname;

    Lesson(){
        System.out.println("Constructor is called");
        this.name = "Java";
    }

    Lesson(String surname){
        System.out.println("Constructor with one parameter is called");
        this.surname = surname;
    }

    Lesson(int a, int b){
        System.out.println("Constructor with two parameters is called");
        System.out.println("a = " + a + ", b = " + b);
    }

}


// later on interfaces. When one class interface two or more other classes.