/**
 * DVD Movie class
 */
public class DvdMovie implements RetailItem{
    private String title;
    private int runningTime;    // running time in minutes
    private double retailPrice;

    /**
     * Constructor
     * @param title The DVD title
     * @param runningTime The running time in minutes
     * @param retailPrice The DVD's retail price
     */
    public DvdMovie(String title, int runningTime, double retailPrice){
        this.title = title;
        this.runningTime = runningTime;
        this.retailPrice = retailPrice;
    }

    /**
     * getTitle method
     * @return The DVD's title
     */
    public String getTitle() {
        return title;
    }

    /**
     * getRunningTime method
     * @return the DVD's running time, in minues
     */
    public int getRunningTime() {
        return runningTime;
    }

    /**
     * getRetailPrice method (required by the
     * RetailItem interface)
     * @return The retail price of the DVD
     */
    @Override
    public double getRetailPrice() {
        return retailPrice;
    }
}
