package lesson2;

public class Homework3 {
    public static void main(String[] args) {
        String word = "mobie";
        int lastletter = word.length()-1;

        String croppedword = word.substring(1,lastletter);
        System.out.println(croppedword);
    }
}
