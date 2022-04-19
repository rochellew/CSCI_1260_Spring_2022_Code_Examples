/**
 * This class demonstrates ArrayList
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDriver {
    public static void main(String[] args) {
        // create the ArrayList
        ArrayList<String> cars = new ArrayList<>();

        // using wrapper class
        ArrayList<Integer> numbers = new ArrayList<>();

        // add to the ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Porsche");
        cars.add("Aston Martin");
        cars.add("Lamborghini");

        // display collection
        System.out.println(cars);

        // get a specified element
        cars.get(0);

        // change a specified element
        cars.set(0, "Maserati");
        System.out.println(cars);

        // sort the collection
        Collections.sort(cars);
        System.out.println(cars);

        // loop through and print each item
        for(String car : cars)
        {
            System.out.println(car);
        }

        // remove a specified element
        cars.remove(0);
        System.out.println(cars);

        // size of the collection
        System.out.println(cars.size());

        // remove all elements
        cars.clear();
        System.out.println(cars.size());
    }
}
