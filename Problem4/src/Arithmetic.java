import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int a,b;
        int result;
        System.out.println("Enter two number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Sum is :"+(a+b));
        System.out.println("sub is: "+(a-b));
        System.out.println("Multiplication is: "+a*b);
        System.out.println("Division is :"+a/b);
        System.out.println("Divisor is:"+a%b);
    }
}
