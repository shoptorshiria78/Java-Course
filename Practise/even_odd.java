import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int a = num.nextInt();

        if(a%2 == 0){
            System.out.println("this is even number");
        }else{
            System.out.println("this is odd number");
        }
        
    }
    
}
