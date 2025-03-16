package Lesson8;

class Mammals {
    void mam() {
        System.out.println("Inside Mammals class");
    }
}

class Lion extends Mammals {
    void roar() {
        System.out.println("Inside Lion  class");
    }
}

class Human extends Mammals {
    void roar() {
        System.out.println("Inside  Human class");
    }
}

class Main {
    public static void main(String[] args) {

        Lion obj = new Lion();
        obj.mam();
        obj.roar();
    }

}