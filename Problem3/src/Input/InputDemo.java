package Input;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
      String name;
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Name: "+name);


    }
}
