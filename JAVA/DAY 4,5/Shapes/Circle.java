package assignment;

	public class Circle extends Shape {
	    private double radius;

	    // Constructor
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Override the area() method for Circle
	    @Override
	    public double area() {
	        return Math.PI * radius * radius;
	    }
	
}
