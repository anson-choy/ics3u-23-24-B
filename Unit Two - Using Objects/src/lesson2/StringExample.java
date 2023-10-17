package lesson2;

public class StringExample {
    public static void main(String[] args) {
        
    String s1 = "alphabet soup";

    int length = s1.length();
    System.out.println("The length of the string is: " + length);
    System.out.println("The length of the string is: " + s1.length());

    int index = s1.indexOf("bet");

    System.out.println("The index of bet in s1 is : " + index);

    String s2 = "happy";
    System.out.println("The index of bet in s1 is : " + s1.indexOf(s2));

    // try and get the substring "bet"
    String subString1 = s1.substring(5, 8);
    String subString2 = s2.substring(1);

    System.out.println(subString1);
    System.out.println(subString2);
    System.out.println("desk".length());

    String str = "CompSci";

System.out.println(str.substring(0, 3));

int num = str.length();
System.out.println(num);
    }
}