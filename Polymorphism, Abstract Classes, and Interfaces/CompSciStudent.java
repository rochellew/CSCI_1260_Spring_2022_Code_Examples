public class CompSciStudent extends Student {
    // Required hours
    private final int MATH_HOURS = 20;      // Math hours
    private final int CS_HOURS = 40;        // Comp sci hours
    private final int GEN_ED_HOURS = 60;    // Gen ed hours

    // Hours taken
    private int mathHours;      // Math hours taken
    private int csHours;        // Comp sci hours taken
    private int genEdHours;     // Gen ed hours taken

    /**
     * The constructor sets the student's name, ID number,
     * and the year admitted field values.
     * @param name The student's name
     * @param idNumber The student's ID number
     * @param yearAdmitted The year the student was admitted
     */
    public CompSciStudent(String name, String idNumber, int yearAdmitted)
    {
        super(name, idNumber, yearAdmitted);
    }

    /**
     * Sets the math hours taken
     * @param mathHours The math hours taken
     */
    public void setMathHours(int mathHours) {
        this.mathHours = mathHours;
    }

    /**
     * Sets the cs hours taken
     * @param csHours The cs hours taken
     */
    public void setCsHours(int csHours) {
        this.csHours = csHours;
    }

    /**
     * Sets the gen ed hours taken
     * @param genEdHours The gen ed hours taken
     */
    public void setGenEdHours(int genEdHours) {
        this.genEdHours = genEdHours;
    }

    /**
     * The getRemainingHours method returns
     * the number of hours remaining to be taken.
     * @return The hours remaining for the student
     */
    @Override
    public int getRemainingHours() {
        int requiredHours;
        int remainingHours;

        // calculate required hours
        requiredHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;

        // calculate remaining hours
        remainingHours = requiredHours - (mathHours + csHours + genEdHours);

        return remainingHours;
    }

    @Override
    public String toString(){
        String str;

        str = super.toString() +
                "\nMajor: Computer Science" +
                "\nMath Hours Taken: " + mathHours +
                "\nComputer Science Hours Taken: " + csHours +
                "\nGeneral Ed Hours Taken: " + genEdHours;

        return str;
    }
}
