/**
 * This class extends from GradedActivity, meaning
 * FinalExam inherits GradedActivity's public/protected
 * fields and methods
 */
public class FinalExam extends GradedActivity {

    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int questions, int missed){
        numQuestions = questions;
        numMissed = missed;

        pointsEach = 100.0 / questions;
        double numericScore = 100.0 - (missed * pointsEach);

        setScore(numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
