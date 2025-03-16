package Lesson8;
//  parent class
 class Parent {

    int age, id;
    String name;
    void naming(String name){
        System.out.println("Name:" + name);
    }
    
}

// child class

class Child extends Parent{
    void ageN(int age){
        System.out.println("Age of student is " + age);
    }
}

 class Main {
    public static void main(String[] args) {
        Child s = new Child();
        s.naming("Riziya");
        s.ageN(14);
    }

    
}
