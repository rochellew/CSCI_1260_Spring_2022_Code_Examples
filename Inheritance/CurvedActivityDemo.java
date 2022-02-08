import java.util.Scanner;

public class CurvedActivityDemo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double score;
        double curvePercent;

        // Get the things from the keyboard
        System.out.print("Enter the student's raw score: ");
        score = kb.nextDouble();

        System.out.print("Enter the curve percentage: ");
        curvePercent = kb.nextDouble();

        // Create CurvedActivity object
        CurvedActivity curvedExam = new CurvedActivity(curvePercent);

        // set the raw score of the CurvedActivity object
        curvedExam.setScore(score);

        // Display the curved exam's properties
        System.out.println("The raw score is " + curvedExam.getRawScore());
        System.out.println("The curved score is " + curvedExam.getScore());
        System.out.println("The exam grade is " + curvedExam.getGrade());
    }
}
