/**
 * This program demonstrates an enumerated type (enum)
 * and its methods included by Java
 */
public class EnumDemo {
    enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY };

    public static void main(String[] args) {

        // Declare a Day variable and assign it a value
        Day workDay = Day.WEDNESDAY;

        // The following statement displays WEDNESDAY
        System.out.println(workDay.toString());

        // The following statement displays the
        // ordinal value for Day.SUNDAY
        System.out.println("The ordinal value for " + Day.SUNDAY +
                " is " + Day.SUNDAY.ordinal() + ".");

        // The following statement displays the
        // ordinal value for Day.SATURDAY
        System.out.println("The ordinal value for " + Day.SATURDAY +
                " is " + Day.SATURDAY.ordinal() + ".");

        // The following statement checks if
        // workDay is equal to Day.TUESDAY
        if(workDay.equals(Day.TUESDAY))
            System.out.println("The workday is Tuesday.");
        else
            System.out.println("The workday is NOT Tuesday");

        // The following statement compares two enum constants
        if(Day.FRIDAY.compareTo(Day.SATURDAY) > 0) {
            System.out.println(Day.FRIDAY + " is greater than " +
                                Day.SATURDAY + ".");
        }
        else {
            System.out.println(Day.FRIDAY + " is NOT greater than " +
                    Day.SATURDAY + ".");
        }
    }
}
