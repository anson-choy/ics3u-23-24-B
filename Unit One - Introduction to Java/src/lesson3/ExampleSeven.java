package lesson3;

public class ExampleSeven {
    public static void main(String[] args) {
        int numStudents = 15; 

        // this adds 3 students to the class
        numStudents = numStudents + 3;

        numStudents += 3;
        // does the same thing 
        // *=, -=, +=, /=, %= are all compound assignments

        numStudents++;
        // adds one

        numStudents--;
        //subtracts one

        numStudents-=10;
        numStudents*=2;
        numStudents /=3;
        numStudents++; 

        // numStudents is 8
    }
}
