package Lesson3.polymorphism;

// First type
public class Numbers {
    void sum(int a, int b) {
        System.out.println(a + b);
    }
    void num(double a, int b){
        System.out.println(a + b);
    }

    void sum(int a,int b, int c) {
        System.out.println(a + b + c);

    }
    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2, 3);
        obj.sum(9, 2);
    }
}

