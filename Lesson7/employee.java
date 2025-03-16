package Lesson7;

 class employee {
    int empno;
    String name;
    float salary;

    employee(){
        System.out.println("*******");
        empno = 202;
        name = "Riziya";
        salary = 40000f;
    }

    void displayDetails(){
        System.out.println(empno + "|" + name + "|" + salary);
    }
}

 class Main {
    public static void main(String[] args) {
        employee emp1 = new employee();
        employee emp2 = new employee();
        employee emp3 = new employee();

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }

    
}
