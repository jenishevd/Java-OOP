package Lesson2;

public class Singleton {
    private static Singleton instance;
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


/*
Singleton - class which can create one object.

Allow to create only one object.
if u want to have only one object of a class, use singleton.

 */