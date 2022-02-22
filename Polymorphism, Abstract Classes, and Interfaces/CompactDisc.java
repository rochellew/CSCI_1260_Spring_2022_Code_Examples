/**
 * Compact Disc class
 */
public class CompactDisc implements RetailItem{
    private String title;
    private String artist;
    private double retailPrice;

    /**
     * Constructor
     * @param title The CD title.
     * @param artist The name of the artist.
     * @param retailPrice The CD's price.
     */
    public CompactDisc(String title, String artist, double retailPrice){
        this.title = title;
        this.artist = artist;
        this.retailPrice = retailPrice;
    }

    /**
     * getTitle method
     * @return The CD's title
     */
    public String getTitle() {
        return title;
    }

    /**
     * getArtist method
     * @return The CD's artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * getRetailPrice method (required by the
     * RetailItem interface)
     * @return the retail price of the CD.
     */
    @Override
    public double getRetailPrice() {
        return retailPrice;
    }
}
