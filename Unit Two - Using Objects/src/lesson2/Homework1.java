package lesson2;

public class Homework1 {
    public static void main(String[] args) {
        String tag = "<<>>";
        String word = "bleh";

        String result = tag.substring(0,2) + word + tag.substring(2);
        System.out.println(result);
    }
}
