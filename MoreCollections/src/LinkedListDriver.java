/**
 * This class demonstrates a linked list
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDriver {
    public static void main(String[] args) {
        // create the LinkedList
        LinkedList<String> cars = new LinkedList<>();
        // add to the LinkedList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Porsche");
        cars.add("Aston Martin");
        cars.add("Lamborghini");
        System.out.println(cars);

        cars.addFirst("Kia");
        cars.addLast("Honda");
        cars.removeFirst();
        cars.removeLast();
    }
}
