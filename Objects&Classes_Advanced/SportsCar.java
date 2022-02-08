/**
 * This class uses enums that have been created in their
 * own file as fields
 */
public class SportsCar {
    private CarType make;   // the car's make
    private CarColor color; // the car's color
    private double price;   // the car's price

    /**
     * The constructor initializes the car's make, color, and price
     * Note that the make and color are enum constants of the CarMake
     * and CarColor classes.
     * @param make The car's make
     * @param color The car's color
     * @param price The car's price
     */
    public SportsCar(CarType make, CarColor color, double price){
        this.make = make;
        this.color = color;
        this.price = price;
    }

    public CarColor getColor() {
        return color;
    }

    public CarType getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public void setMake(CarType make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {

        // the toString on make is not required, as Java can implicitly
        // convert to a string on those objects that have a toString method
        String carString = String.format("Make:\t%s\n"+
                                        "Color:\t%s\n"+
                                        "Price:\t$%,.2f",
                                        make.toString(), color, price);
        return carString;
    }
}
