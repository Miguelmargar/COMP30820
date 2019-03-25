package Pract_6;

public class Question_3 {
    private double n;
    private double length;
    private double x;
    private double y;


    public Question_3() {
        this(3, 1, 0, 0);
    }

    public Question_3(double n, double length) {
        this.n = n;
        this.length = length;
        this.x = 0;
        this.y = 0;
    }

    public Question_3(double n, double length, double x, double y) {
        this.n = n;
        this.length = length;
        this.x = x;
        this.y = y;
    }

    // Getters ------------------------------------------

    public double getN() {
        return n;
    }

    public double getLength() {
        return length;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters-------------------------------------------

    public void setN(double n) {
        this.n = n;
    }

    public  void  setLength(double length) {
        this.length = length;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * length;
    }

    public double getArea() {
        return (n * Math.pow(length, 2)) / (4 * Math.tan(Math.PI/n));
    }

    public String toString() {
        return "n is: " + n + " length is: " + length + " X is: " + x + " Y is: " + y;
    }
}
