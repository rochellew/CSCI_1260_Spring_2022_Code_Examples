/**
 * This program demonstrates the CompSciStudent class
 */
public class CompSciStudentDemo {
    public static void main(String[] args) {
        // Create a CompSciStudent object
        CompSciStudent csStudent = new CompSciStudent("Jane Doe", "167W98337", 2022);

        // store values for math, CS, and gen ed hours
        csStudent.setMathHours(12);
        csStudent.setCsHours(20);
        csStudent.setGenEdHours(40);

        // Display the student's data
        System.out.println(csStudent.toString());

        // Display the number of remaining hours
        System.out.println("\nHours remaining: " + csStudent.getRemainingHours());
    }
}
