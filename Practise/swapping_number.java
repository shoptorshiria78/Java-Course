import java.util.Scanner;

public class swapping_number {
    public static void main(String[] args) {
       Scanner num = new Scanner(System.in);
       int a = num.nextInt();
       int b = num.nextInt();
       
       System.out.println("before swapping a:"+ a +", b:"+ b);
       a = a+b;
       b = a-b;
       a = a-b;
       System.out.println("After swapping a:"+ a +", b:"+ b);
    }
}
