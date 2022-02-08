import java.util.Scanner;

public class PassFailExamDemo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int questions;
        int missed;
        double minPassing;

        // get the things from the keyboard
        System.out.print("How many questions are on the exam: ");
        questions = kb.nextInt();
        System.out.print("How many questions did the student miss: ");
        missed = kb.nextInt();
        System.out.print("What is the minimum score to pass the exam: ");
        minPassing = kb.nextDouble();

        // create PassFailExam object, passing in the keyboard values
        PassFailExam exam = new PassFailExam(questions, missed, minPassing);

        // display the grade properties
        System.out.println("Each question counts " + exam.getPointsEach() + " points.");
        System.out.println("The exam score is " + exam.getScore());
        System.out.println("The exam grade is " + exam.getGrade());
    }
}
