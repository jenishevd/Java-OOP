package Lesson1;

public class Lesson01_Main {
    public static void main(String[] args) {
        Student student1 = new Student(11,"Daniar", 90);
        Student student2 = new Student();
        student1.changeName("Beksjon");
        student1.greeting();
        student2.greeting();
//        student1.rno = 13;
//        student1.name = "Danidsaar";
//        student1.marks = 49.3f;
//        System.out.println(student1.rno);
//        System.out.println(student1.name);
//        System.out.println(student1.marks);
    }
}
