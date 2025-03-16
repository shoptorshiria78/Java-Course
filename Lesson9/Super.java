package Lesson9;
// super class
 class Superclass {

    int number = 56;
    
}

class Subclass extends Superclass{
    int number = 56;
    void printNumber(){
        System.out.println(number);
    }
}

 class Main{
public static void main(String[] args) {
    Subclass sub = new Subclass();
    sub.printNumber();
}
    
}