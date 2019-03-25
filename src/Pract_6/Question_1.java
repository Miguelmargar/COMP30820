package Pract_6;

public class Question_1 {
    private double radius; // The radius
    private double x;
    private double y;
    private static int numberOfObjects = 0; // Number of objects created

    // Construct a circle with radius 1
    public Question_1() {
        this(1.0, 0.0, 0.0);
    }

    // Construct a circle with the specified radius and x and y coordinates
    public Question_1(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        numberOfObjects++;
    }

    // Return the radius
    public double getRadius() {
        return radius;
    }

    // Return the X
    public double X() {
        return x;
    }

    // Return the Y
    public double Y() {
        return y;
    }

    // Set a new radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // set new center
    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Return the number of objects created
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    // Return the area
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDistance(Question_1 c) {
        return Math.sqrt((Math.pow(c.x - x, 2) + (Math.pow(c.y - y, 2))));
    }

    // Return a string representation
    public String toString() {
        return "radius = " + radius + "\nx = " + x + "\ny = " + y + "\n";

    }
}
