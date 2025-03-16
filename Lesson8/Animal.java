package Lesson8;
// parent class
 class Animal {
    void eat(){
        System.out.println("eating..... animal class..... eat method");
    }
    
}
// child class
 class Lion extends Animal {

    void roar(){
        System.out.println("Roar ..... Lion class..... roar method");
    }
}

// child of child

 class BabyLion extends Lion{
    void weep(){
        System.out.println("weep...... BabyLion class.....weeping method");
    }
}

class Main{
public static void main(String[] args) {
    BabyLion obj = new BabyLion();
    obj.weep();
    obj.roar();
    obj.eat();
}
}
