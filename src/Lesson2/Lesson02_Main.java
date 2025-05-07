/*
    Lesson 2 - Packages, Static, Singleton Class, In-built Methods

    Static means "This thing belongs to the class itself, not to any specific obj"
    It can be called everywhere, and without creating an object.
    Static method only access static data. Non-static belongs to an object
 */

package Lesson2;


import com.sun.tools.javac.Main;

public class Lesson02_Main {
    public static void main(String[] args) {
//        Human daniar = new Human("Daniar", 20, 3000, false);
//        Human kunal = new Human("Kunal", 34, 2000, true);
//
//        //System.out.println(daniar.population); // is wrong
//        //System.out.println(kunal.population); // is wrong
//        System.out.println(Human.population); // this is convention
    }

    static void fun(){
        //greeting(); // you cant use this because it requires an instance.
        System.out.println("Hello World!");

    }
    void greeting(){
        System.out.println("Hello World!");
    }
}
