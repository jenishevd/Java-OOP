package Lesson2;
// outside classes cannot be static
public class InnerClasses {
    static class Test{
         String name;

        Test(String name){
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Test a = new Test("daniiar");
        Test b = new Test("rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

// static class A {}

// Inner Classes
// 
