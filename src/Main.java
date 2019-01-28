import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int studentNumericGrade = 0;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What's the student's numeric grade?");
        studentNumericGrade = myScanner.nextInt();

        if (studentNumericGrade >= 90) {
            System.out.println("You got an A!");
        } else if (studentNumericGrade >= 80) {
            System.out.println("You got a B!");
        } else if (studentNumericGrade >= 70) {
            System.out.println("You got a C!");
        } else if (studentNumericGrade >= 60) {
            System.out.println("You got a D!");
        } else {
            System.out.println("You failed.");
        }
    }
}
