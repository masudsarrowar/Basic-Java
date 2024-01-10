import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int digit;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        digit = sc.nextInt();
        switch (digit)
        {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Error");

        }

    }
}
