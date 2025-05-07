package Lesson2;
// outside classes cannot be static
public class InnerClasses {
    static class Test{
         String name;

        Test(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

    }

    public static void main(String[] args) {
        Test a = new Test("daniiar");
        Test b = new Test("rahul");

        System.out.println(a);
        System.out.println(b);
    }
}


/*
Inner Classes
Used to logically group classes that belong together and to increase encapsulation.

Added @overrid.... to print new obj correctly, the name, not the hexcode


 */



