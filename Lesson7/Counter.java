package Lesson7;
class Counter {

    int number = 10;

    void increment(){
        number = number+1;
    }

    public static void main(String[] args) {
        Counter object1 = new Counter();
        Counter object2 = new Counter();
        Counter object3 = new Counter();
        Counter object4 = new Counter();

        object1.increment();
        object2.increment();
        object3.increment();
        object4.increment();

        System.out.println(object1.number);
        System.out.println(object2.number);
        System.out.println(object3.number);
        System.out.println(object4.number);
    }
    
}
