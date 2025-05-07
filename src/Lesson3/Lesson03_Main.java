/*
    Lesson 3 | Principles - Inheritance, Polymorphism, Encapsulation, Abstraction.
 */
package Lesson3;

public class Lesson03_Main {
    public static void main(String[] args) {
//        Box box = new Box(32, 90, 55);
//        Box box2 = new Box(box);
//
//        System.out.println(box.l + " " + box.w + " " + box.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box3.h + " " + box3.weight);

//        Box box5 = new BoxWeight(2, 3, 4, 5);
//        System.out.println(box5);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // Hence, you should have access to weight variable
        // this also means, taht the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will u call the constructor of child class
        //BoxWeight box6 = new Box(); // box has no idea about var weight, => error
        //System.out.println(box6);

        BoxPrice box = new BoxPrice(2, 3, 200 );
        System.out.println(box);

    }
}



