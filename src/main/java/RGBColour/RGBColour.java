package RGBColour;

/**
 * This class initiates the red, green and blue colours
 * for the RGB color code.
 * @author Klaudia K
 */

public class RGBColour {
    private double r = 0;
    private double g = 0;
    private double b = 0;

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