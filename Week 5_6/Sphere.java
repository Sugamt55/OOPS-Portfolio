package Week5_6;

import java.text.DecimalFormat;

class Sphere {
    private double diameter;

    // Constructor
    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    // Getter for diameter
    public double getDiameter() {
        return diameter;
    }

    // Setter for diameter
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(diameter / 2.0, 3);
    }

    // Method to calculate surface area
    public double calculateSurfaceArea() {
        return 4.0 * Math.PI * Math.pow(diameter / 2.0, 2);
    }

    // ToString method
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Sphere with diameter " + df.format(diameter);
    }
}