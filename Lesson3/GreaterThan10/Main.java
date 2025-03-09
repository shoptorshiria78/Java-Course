package Lesson3.GreaterThan10;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if (num>10) {
            System.out.println("Yes I am greater than 10");
            
        }else{
            System.out.println("Sorry I am not grater than 10");
        }
    }
    
}
