package assignment;

public class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override the area() method for Rectangle
    @Override
    public double area() {
        return width * height;
    }


}
