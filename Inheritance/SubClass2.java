public class SubClass2 extends SuperClass2{
    public SubClass2() {
        // super() is called by default if you do not
        // explicitly call a superclass constructor
        super(10);
        System.out.println("This is the subclass constructor.");
    }
}
