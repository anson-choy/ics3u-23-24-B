package lesson2;

public class Homework2 {
    public static void main(String[] args) {
        String word = "homework";

        int half = (word.length()/2);

        String halfword = word.substring(0,half);
        System.out.println(halfword);
    }
}
