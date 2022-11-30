package RGBColour;

/**
 * This class is used to test RGBColour
 * using a Test-Driven Development process.
 * @author Klaudia K
 */

public class Test {
    public static void main(String[] args) {

        System.out.println("Testing RGBColour!\n");

        RGBColour colour1 = new RGBColour(0.5, 0.5, 0.5);
        System.out.println(colour1.toString());
    }
}