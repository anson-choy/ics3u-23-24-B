package lesson5;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Please enter a value of US Dollars: ");

        double US = in.nextDouble();

        double canadianDollars = US * 1.25;

        System.out.println("The amount in Canadian Dollars is : " + canadianDollars);
    
        in.close();
    }
}
