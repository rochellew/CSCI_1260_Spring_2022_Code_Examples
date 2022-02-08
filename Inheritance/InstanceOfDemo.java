public class InstanceOfDemo {
    public static void main(String[] args) {
        GradedActivity activity = new GradedActivity();
        PassFailExam exam = new PassFailExam(100,5,80);

        if(activity instanceof GradedActivity)
            System.out.println("Yes, activity is a GradedActivity.");
        else
            System.out.println("No, activity is not a GradedActivity.");

        if(exam instanceof PassFailExam)
            System.out.println("Yes, exam is a PassFailExam");
        else
            System.out.println("No, exam is not a PassFailExam");

        if(exam instanceof GradedActivity)
            System.out.println("Yes, exam is a GradedActivity");
        else
            System.out.println("No, exam is not a GradedActivity");
    }
}
