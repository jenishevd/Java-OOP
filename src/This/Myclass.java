package This;

// Using this for Ambiguity Variable Names

class MyClass {
    // instance variable
    int age;

    // parameter
    MyClass(int age){
        age = age;
    }
}

class Main {

    int age;
    Main(int age){
        age = age;
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("obj.age = " + obj.age);
    }
}

//class Main {
//
//    int age;
//    Main(int age){
//        this.age = age;
//    }
//
//    public static void main(String[] args) {
//        Main obj = new Main(8);
//        System.out.println("obj.age = " + obj.age);
//    }
//}


//Also, if the name of the parameter and instance variable is different,
// the compiler automatically appends this keyword. For example, the code:
//
//class Main {
//    int age;
//
//    Main(int i) {
//        age = i;
//    }
//}
//is equivalent to:
//
//class Main {
//    int age;
//
//    Main(int i) {
//        this.age = i;
//    }
//}