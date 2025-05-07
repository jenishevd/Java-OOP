package Lesson2;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    static long population;

    static void message(){
        //System.out.println(this.age); // cant use this inside static func
    }

    Human(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
