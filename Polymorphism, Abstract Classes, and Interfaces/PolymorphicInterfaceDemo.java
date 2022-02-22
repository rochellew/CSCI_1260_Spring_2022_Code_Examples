public class PolymorphicInterfaceDemo {
    public static void main(String[] args) {
        // Create a CompactDisc object
        CompactDisc cd1 = new CompactDisc("Aladdin Sane","David Bowie",19.99);
        RetailItem cd2 = new CompactDisc("No Limit Top Dogg", "Snoop Dogg", 49.99);

        // Create a DvdMovie object
        DvdMovie movie1 = new DvdMovie("Akira", 124, 3.99);
        RetailItem movie2 = new DvdMovie("Suspira", 99, 29.95);

        // Display the CDs' information
        System.out.println("Item #1: " + cd1.getTitle());
        showPrice(cd1);

        // This WON'T WORK
        // System.out.println("Item #2: " + cd2.getTitle());
        // showPrice(cd2);

        System.out.println("Item #2: " + movie1.getTitle());
        showPrice(movie1);

        // This WON'T WORK
        // System.out.println("Item #4: " + movie2.getTitle());
        // showPrice(movie2);

    }

    private static void showPrice(RetailItem item){
        System.out.printf("Price: $%,.2f\n", item.getRetailPrice());
    }
}
