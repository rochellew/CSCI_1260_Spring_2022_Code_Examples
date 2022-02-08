public class ConstructorDemo2 {
    public static void main(String[] args) {

        // notice the superclass constructor's print
        // statement is executed BEFORE the subclass
        // constructor's print statement.
        SubClass2 object = new SubClass2();
    }
}
