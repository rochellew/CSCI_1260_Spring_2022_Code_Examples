/**
 * This class demonstrates a static field & method
 */
public class Countable {
    private static int instanceCount = 0;

    // constructor
    public Countable(){
        instanceCount++;
    }

    // getter
    public static int getInstanceCount() {
        return instanceCount;
    }
}
