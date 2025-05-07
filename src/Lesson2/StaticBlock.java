package Lesson2;
// this is a demo to show initialisation of static vars
public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once, when the first obj is created. i.e. when is loaded for thr 1 time.
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b );

        StaticBlock.b += 3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b );
    }
}


/*
Static is a modifier used for memory management.
and applicable to variables, methods, blocks and nested classes
Static - it belongs to the class, rather than any specific instance of the class

Static Variable - is shared among all instances of a class

Static Method - can be called without instance of the class.
-it can only access: other static methods and static vars.
-Static methods cannot access instance vars or methods directly.

Static Blocks - used for static initialization of a class
- Executed once when the class is loaded
- Useful for initializing static vars.

Static Classes(Nested)
- Only inner classes can be static.

-Static nested class does not need an instance of outer
- It can access only static members of the outer class

When to use Static?
- When you want to have a common property across all objects
- When a method doesn't depend on object state
- When creating nested classes that don't need access to outer class's instance

Static Variable	        -   Shared among all instances
Static Method	        -   Can be called without object
Static Block	        -   Executes once when class loads
Static Inner Class	    -   Does not need outer class instance

 */