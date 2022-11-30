package RGBColour;

//import RGBColour.RGBColour.convertToRGB;
//import static RGBColour.RGBColour.createWindow;

/**
 * This class is used to test RGBColour
 * using a Test-Driven Development process.
 * @author Klaudia K
 */

public class Test {
    public static void main(String[] args) {

        System.out.println("Testing RGBColour!\n");

        // Colour 1
        System.out.println("Colour 1:");
        RGBColour colour1 = new RGBColour(0.5, 0.7, 0.9);
        System.out.println(colour1);

        colour1.convertToRGB(colour1.getR(), colour1.getG(), colour1.getB());
        colour1.createWindow();

        //Colour 2
        System.out.println("\nColour 2:");
        RGBColour colour2 = new RGBColour(0.988, 0.4745, 0.8196);
        System.out.println(colour1);

        colour2.convertToRGB(colour2.getR(), colour2.getG(), colour2.getB());
        colour2.createWindow();
    }
}