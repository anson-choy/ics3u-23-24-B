package lesson5;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a temperature in Fahrenheit: ");
        int fahrenheit = in.nextInt();

        double celsius = ((double)fahrenheit - 32) * 5 / 9;

        System.out.println("The temperature in Celsius is: " + celsius);

        in.close();
    }
}
