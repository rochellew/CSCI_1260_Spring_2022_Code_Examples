/**
 * This is an abstract class that holds general data
 * about a student. Classes representing different types
 * of students should inherit from this class.
 */

public abstract class Student {
    private String name;        // Student name
    private String idNumber;    // Student ID
    private int yearAdmitted;   // Year admitted

    /**
     * The constructor sets the student's name, ID number,
     * and year admitted field values
     * @param name The student's name
     * @param idNumber The student's ID number
     * @param yearAdmitted The year the student was admitted
     */
    public Student(String name, String idNumber, int yearAdmitted){
        this.name = name;
        this.idNumber = idNumber;
        this.yearAdmitted = yearAdmitted;
    }

    /**
     * The toString method returns a String
     * containing the student's data
     * @return A reference to a string
     */
    public String toString()
    {
        String str;

        str = "Name: " + name
        + "\nID Number: " + idNumber
        + "\nYear Admitted: " + yearAdmitted;

        return str;
    }

    /**
     * The getRemainingHours method is abstract.
     * It MUST be overridden in a subclass.
     * @return The hours remaining for a student
     */
    public abstract int getRemainingHours();

}
