package RGBColour;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class is used to test RGBColour
 * using a Test-Driven Development process.
 * @author Klaudia K
 */

public class RGBColourTest {
    @Test
    public void testRGBRed() {
        RGBColour testColour = new RGBColour(0.5, 0.7, 0.9);
        // The expected RGB value of 0.5 is 127
        assertEquals(127 ,testColour.convertToRGB(testColour.getR(), testColour.getG(), testColour.getB()), 0);
    }

    @Test
    public void testEquals() {
        RGBColour testColour1 = new RGBColour(0.5, 0.7, 0.9);
        RGBColour testColour2 = new RGBColour(0.6, 0.7, 0.9);
        assertEquals(false ,testColour1.equals(testColour2));
    }

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
        System.out.println(colour2);

        colour2.convertToRGB(colour2.getR(), colour2.getG(), colour2.getB());
        colour2.createWindow();

        //Colour 3
        System.out.println("\nColour 3:");
        RGBColour colour3 = new RGBColour(1, 0, 0.333);
        System.out.println(colour3);

        colour3.convertToRGB(colour3.getR(), colour3.getG(), colour3.getB());
        colour3.createWindow();

        //Colour 4
        System.out.println("\nColour 4:");
        RGBColour colour4 = new RGBColour(0.5, 0.7, 0.9);
        System.out.println(colour4);

        colour4.convertToRGB(colour4.getR(), colour4.getG(), colour4.getB());
        colour4.createWindow();

        //Testing Equality with Method in RGBColour.java
        if (colour1.equals(colour4)) {
            System.out.println("\nColour 1 = Colour 4");
        } else if (!colour1.equals(colour4)) {
            System.out.println("\nColour 1 != Colour 4");
        }

        if (colour1.equals(colour2)) {
            System.out.println("\nColour 1 = Colour 2");
        } else if (!colour1.equals(colour2)) {
            System.out.println("\nColour 1 != Colour 2");
        }
    }
}