package lesson4;

public class ExampleTwo {
    public static void main(String[] args) {
        // int x = 6.7; // cannot assign a double into a int variable

        int x = (int) 6.7;

        // double to int would be narrowing cast conversion (giving less specific data) and int to double would be widening (giving more specific data)

        System.out.println(x);
    }
}
