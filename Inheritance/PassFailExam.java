public class PassFailExam extends PassFailActivity{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public PassFailExam(int numQuestions, int numMissed, double minPassingScore){
        super(minPassingScore);
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;

        pointsEach = 100.0 / numQuestions;

        // create variable to hold the numeric score of the exam
        double numericScore = 100.0 - (numMissed * pointsEach);

        setScore(numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
