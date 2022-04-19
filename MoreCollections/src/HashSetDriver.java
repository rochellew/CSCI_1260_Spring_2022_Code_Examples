/**
 * This class demonstrates a hash set
 */

import java.util.HashSet;

public class HashSetDriver {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();

        cars.add("Volvo");
        cars.add("BMW");

        // this bmw won't appear -- hash sets contain only unique
        // instances of objects
        cars.add("BMW");

        cars.add("Ferrari");
        cars.add("Porsche");
        cars.add("Aston Martin");
        cars.add("Lamborghini");

        System.out.println(cars);

        // check if an item exists
        if(cars.contains("Ferrari")) {
            System.out.println("Ferrari exists");
        }

        // loop through hash set
        for(String i : cars)
        {
            System.out.println(i);
        }

        // remove object
        cars.remove("Lamborghini");

        // remove all objects
        cars.clear();

    }
}
