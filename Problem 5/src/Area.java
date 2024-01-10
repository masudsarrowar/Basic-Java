import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double base,height,result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a base :");
        base = sc.nextDouble();
        System.out.println("Enter a height: ");
        height = sc.nextDouble();
        result = 0.5 * base  * height;
        System.out.println("The area of Triangle is: "+result);

    }
}
