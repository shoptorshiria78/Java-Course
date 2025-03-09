package Lesson3.HelloUser;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println("This string is "+str);
        int num = scn.nextInt();
        System.out.println("Number is"+num);
        float fnum = scn.nextFloat();
        System.out.println("the float number is"+ fnum);
    }
    
}
