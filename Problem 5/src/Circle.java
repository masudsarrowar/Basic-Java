import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double r,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        r = sc.nextDouble();
        result = 3.14 * r * r;
        System.out.println("The area of circle is: "+result);

    }
}
