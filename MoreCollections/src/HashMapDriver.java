/**
 * This class demonstrates a hash map
 */

import java.util.HashMap;

public class HashMapDriver {
    public static void main(String[] args) {
        // create the hash map
        HashMap<String, String> capitalCities = new HashMap<>();
        HashMap<String, Integer> people = new HashMap<>();

        // add (put) to the hash map
        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("France","Paris");
        capitalCities.put("Wales", "Cardiff");

        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Sally", 28);

        System.out.println(capitalCities);

        // get/reference a specified item in the hash map
        System.out.println(capitalCities.get("England"));

        // remove a specified item
        capitalCities.remove("Wales");
        System.out.println(capitalCities);

        // loop through the hash map and display the keys
        for(String i : capitalCities.keySet())
        {
            System.out.println(i);
        }
        // loop through the hash map and display the values
        for(String i : capitalCities.values())
        {
            System.out.println(i);
        }

        // loop through the hash map and display the keys and values
        for(String key : capitalCities.keySet())
        {
            System.out.println("Key:\t" + key + "\nValue:\t" + capitalCities.get(key) +"\n");
        }

        // loop through the hash map and display the keys and values
        // (People hash map)
        for(String key : people.keySet())
        {
            System.out.println("Key:\t" + key + "\nValue:\t" + people.get(key) +"\n");
        }
    }
}
