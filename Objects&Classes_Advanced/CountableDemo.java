/**
 * This program demonstrates the Countable class.
 */
public class CountableDemo {
    public static void main(String[] args) {

        // create a variable to store the static field value
        int objectCount;

        // create 3 instances of the Countable class
        Countable object1 = new Countable();
        Countable object2 = new Countable();
        Countable object3 = new Countable();
        Countable object4 = new Countable();
        Countable object5 = new Countable();

        // get the number of instances from the class's static field
        objectCount = object4.getInstanceCount();
        System.out.println(objectCount + " instances of the class were found.");
    }
}
