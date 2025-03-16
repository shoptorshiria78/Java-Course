package Lesson9;

 class Parent {

    public void sayHello() {
          System.out.println("hello from Parent");
    }
    
}

class Child extends Parent {

    public void sayHello() {
          System.out.println("hello from Child");
    }
    
}

 class Main {

  public static void main(String[] args) {

    Parent c = new Child();  
    // Parent  p = new Parent();

    // p.sayHello();
    c.sayHello();
}
    
}