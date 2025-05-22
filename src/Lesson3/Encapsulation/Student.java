package Lesson3.Encapsulation;

public class Student {
    private String name;
    private int age;

   String getName(){
       return name;
   }

   void setName(String name){
       this.name = name;
   }

   int getAge(){
       return age;
   }

   void setAge(int age){
       if (age > 1) this.age = age;
   }

}
