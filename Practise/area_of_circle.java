import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int radius = num.nextInt();

        double area = 3.1416 * radius * radius ;

        System.out.println("Radius of the circle is "+ area);

    }
}
