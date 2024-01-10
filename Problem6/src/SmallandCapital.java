import java.util.Scanner;

public class SmallandCapital {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter a character: ");
        Scanner  sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("Small letter");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("Capital letter");
        }
        else
        {
            System.out.println("Not a letter");
        }
    }
}
