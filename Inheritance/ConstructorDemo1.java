public class ConstructorDemo1 {
    public static void main(String[] args) {

        // notice the superclass constructor's print
        // statement is executed BEFORE the subclass
        // constructor's print statement.
        SubClass1 object = new SubClass1();
    }
}
