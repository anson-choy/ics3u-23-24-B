package lesson3;

public class ExampleFour {
    public static void main(String[] args) {
        int num = 673;

        int digit1 = num % 10; // divide by 10 and get the remainder ALWAYS gets the ones digit
        int digit3 = num/100; // there are 6 one hundreds to divide 673 by 100 to get the 6
        int digit2 = num % 100 / 10; // divide by 100 the remainder is 76, then divide by 10 to get 7
    
        int sum = digit1 + digit2 + digit3; 

        // sum of the digits
        System.out.println(sum);
    }
}
