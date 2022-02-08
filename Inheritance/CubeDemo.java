import java.util.Scanner;

public class CubeDemo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double length, width, height;

        System.out.println("Enter the following dimensions of a cube.");
        System.out.print("Length: ");
        length = kb.nextDouble();
        System.out.print("Width: ");
        width = kb.nextDouble();
        System.out.print("Height: ");
        height = kb.nextDouble();

        // Create new Cube with values from keyboard
        Cube companionCube = new Cube(length, width, height);

        // Display the cube's properties
        System.out.println("Here are the cube's properties:");
        System.out.println("Length:\t\t\t" + companionCube.getLength());
        System.out.println("Width:\t\t\t" + companionCube.getWidth());
        System.out.println("Height:\t\t\t" + companionCube.getHeight());
        System.out.println("Base area:\t\t" + companionCube.getArea());
        System.out.println("Surface area:\t" + companionCube.getSurfaceArea());
        System.out.println("Volume:\t\t\t" + companionCube.getVolume());
    }
}
