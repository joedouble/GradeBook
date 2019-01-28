public class Main {

    public static void main(String[] args) {
        int studentNumericGrade = 90;

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
