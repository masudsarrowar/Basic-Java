import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = sc.nextInt();

        System.out.println("Number: "+number);
    }
}
