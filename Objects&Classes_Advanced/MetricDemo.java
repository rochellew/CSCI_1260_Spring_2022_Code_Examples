/**
 * This program utilizes Metric's static methods
 */

import java.util.Scanner;
public class MetricDemo {
    public static void main(String[] args) {
        // variables to store user input
        double miles;
        double kilos;

        // Create Scanner object for user input
        Scanner kb = new Scanner(System.in);

        // get the distance in miles
        System.out.print("Enter a distance in miles: ");
        miles = kb.nextDouble();

        // convert the distance in miles to kilos using static method
        kilos = Metric.milesToKilometers(miles);
        System.out.printf("%,.2f miles equals %,.2f kilometers.", miles, kilos);

        // pretty up the output
        System.out.println("\n");

        // get the distance in kilos
        System.out.print("Enter a distance in kilometers: ");
        kilos = kb.nextDouble();

        // convert the distance in kilos to miles using static method
        miles = Metric.kilometersToMiles(kilos);
        System.out.printf("%,.2f kilometers equals %,.2f miles.", kilos, miles);
    }
}
