import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        if (a > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
