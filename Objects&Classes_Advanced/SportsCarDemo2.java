/**
 * This program demonstrates switching on enumerated types
 */
public class SportsCarDemo2 {
    public static void main(String[] args) {
        // Create SportsCar object
        SportsCar yourNewCar = new SportsCar(CarType.FERRARI, CarColor.BLACK, 100000);

        // get the car make and switch on it
        switch(yourNewCar.getMake()){
            case PORSCHE:
                System.out.println("Your car was made in Germany.");
                break;
            case FERRARI:
                System.out.println("Your car was made in Italy.");
                break;
            case JAGUAR:
                System.out.println("Your car was made in England.");
                break;
            default:
                System.out.println("I do not know where that car was made.");
        }

    }
}
