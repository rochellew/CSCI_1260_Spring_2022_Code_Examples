import java.util.Scanner;

public class FinalExamDemo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int questions;
        int missed;

        System.out.print("How many questions are on the exam: ");
        questions = kb.nextInt();

        System.out.print("How many questions did the student miss: ");
        missed = kb.nextInt();

        // Create FinalExam object, passing in the values to constructor
        FinalExam exam = new FinalExam(questions, missed);

        // Display the information about the exam
        System.out.println("Each question counts " + exam.getPointsEach() +
                " points.\nThe exam score is " + exam.getScore() +
                "\nThe exam grade is " + exam.getGrade());
    }
}
