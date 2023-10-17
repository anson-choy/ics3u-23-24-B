package lesson5;

import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // system.in is the type of scanner
    
        // prompt the user for a number. 
        System.out.print("Please enter a number: ");
        int x = in.nextInt();

        System.out.println(x);

        System.out.println("Please enter a decimal number: ");
        double y = in.nextDouble();

        System.out.println(y);
    }
}
