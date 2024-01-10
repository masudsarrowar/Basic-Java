import java.util.Scanner;

public class PositiveElseif {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a>0)
        {
            System.out.println("Positive");
        }
        else if(a<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Equal");
        }
    }
}
