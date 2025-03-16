package Lesson9;

 class Student{
    int id;
    String name;
    float stipend;

    Student(){}

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, float stipend){
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }

    void displayDetails(){
        System.out.println(this.id + "|"+ this.name + "|" + this.stipend);
    }
    
}

class Main{
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student(86, "Riziya");
        Student std3 = new Student(86, "Riziya", 40000);

        std1.displayDetails();
        std2.displayDetails();
        std3.displayDetails();
    }
}
