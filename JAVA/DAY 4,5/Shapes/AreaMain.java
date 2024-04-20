package assignment;

public class AreaMain {
	  public static void main(String[] args) {
	        // Create objects of Circle and Rectangle
	        Circle circle = new Circle(5);
	        Rectangle rectangle = new Rectangle(4, 6);

	        // Calculate and print the areas
	        System.out.println("Area of Circle: " + circle.area());
	        System.out.println("Area of Rectangle: " + rectangle.area());
	    }

}
