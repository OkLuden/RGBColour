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
    public void convertToRGB(double r, double g, double b) {
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
}