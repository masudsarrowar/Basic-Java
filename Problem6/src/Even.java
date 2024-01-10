import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
