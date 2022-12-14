package RGBColour;

import javax.swing.*;
import java.awt.*;

/**
 * This class initiates the red, green and blue colours
 * for the RGB color code.
 * @author Klaudia K
 */

public class RGBColour {
    // User-given values 0-1
    private double r;
    private double g;
    private double b;

    //Values converted into RGB 0-255
    public int rgbRed;
    public int rgbGreen;
    public int rgbBlue;

    //Constructor

    /**
     * @param newR color for RGB value
     * @param newG color for RGB value
     * @param newB color for RGB value
     */
    public RGBColour(double newR, double newG, double newB) {
        r = newR;
        g = newG;
        b = newB;
    }

    //Getters

    public double getR() {
        return r;
    }

    public double getG() {
        return g;
    }

    public double getB() {
        return b;
    }

    public int getRgbRed() {
        return rgbRed;
    }

    public int getRgbGreen() {
        return rgbGreen;
    }

    public int getRgbBlue() {
        return rgbBlue;
    }

    //Setters

    public void setR(double r) {
        this.r = r;
    }

    public void setG(double g) {
        this.g = g;
    }

    public void setB(double b) {
        this.b = b;
    }

    // Methods

    /**
     * This method throws an exception if an RGB value exceeds 1
     * or is lower than 0. Gives the user a message stating why there's an error
     * @param r check R for error
     * @param g check G for error
     * @param b check B for error
     */
    static void checkValidInput(double r, double g, double b){
        if(r > 1 || g > 1 || b > 1) {
            throw new ArithmeticException("An RGB Value is higher than expected.");
        } else if(r < 0 || g < 0 || b < 0){
            throw new ArithmeticException("An RGB Value is lower than expected.");
        }
    }

    /**
     * This method creates a JFrame window containing the user-given
     * colour as background and the RGB value written as a label
     */
    public void createWindow() {
        JFrame frame = new JFrame("RGB Colour");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 400));

        // Background Colour
        frame.getContentPane().setBackground(new java.awt.Color(rgbRed, rgbGreen, rgbBlue));

        // Label displaying RGB values as text
        JLabel textLabel = new JLabel(("RGB: " + rgbRed + ", " + rgbGreen + ", " + rgbBlue), SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(500, 400));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);

        // Window Visibility
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * This method converts the user input double values into
     * RGB values, making sure they are between 0 and 255
     * @param r taking the red input value
     * @param g taking the green input value
     * @param b taking the blue input value
     */
    public int convertToRGB(double r, double g, double b) {
        //Error Checking
        checkValidInput(r, g, b);
        // Number to be multiplied to convert double to 1-255
        double rgbVal = 255.0;

        // Calculate individual RGB values
        double redVal = r * rgbVal;
        double greenVal = g * rgbVal;
        double blueVal = b * rgbVal;

        // Convert values to integers
        rgbRed = (int)redVal;
        rgbGreen = (int)greenVal;
        rgbBlue = (int)blueVal;
        System.out.println("RGB Values: R: " + rgbRed + ", G: " + rgbGreen + ", B: " + rgbBlue);
        return rgbRed;
    }

    // String representation
    /**
     * @Override Overrides the print function of RGBColour with meaningful labels
     * and formatting
     * @return Returns the printed RGB colours
     */
    @Override
    public String toString() {
        return "Red: " + getR() + ", Green: " + getG() + ", Blue: " + getB();
    }

    //Equivalence
    /**
     * @param colour An RGBColour object
     * @return Returns what we want to print
     */
    public boolean equals(RGBColour colour) {
        boolean isTrue = false;
        if (this.getRgbRed() == colour.getRgbRed() && this.getRgbGreen() == colour.getRgbGreen() &&
                this.getRgbBlue() == colour.getRgbBlue()) {
            isTrue = true;
        } else if (this.getRgbRed() != colour.getRgbRed() && this.getRgbGreen() != colour.getRgbGreen() &&
                this.getRgbBlue() != colour.getRgbBlue()) {
            isTrue = false;
        }
        System.out.println("\n**RGB Colour Equality Test**");
        System.out.println("Colour 1:\n Red: " + colour.getRgbRed() +
                " Green: " + colour.getRgbGreen() +
                " Blue: " + colour.getRgbBlue());
        System.out.println("Colour 2:\n Red: " + this.getRgbRed() +
                " Green: " + this.getRgbGreen() +
                " Blue: " + this.getRgbBlue());
        return isTrue;
    }
}