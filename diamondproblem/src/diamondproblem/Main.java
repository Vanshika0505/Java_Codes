package diamondproblem;

interface Shape {
	  // Define methods common to shapes (e.g., area())
	  default void draw() {
	    System.out.println("Drawing a shape");
	  }
}

interface Colored {
	  // Define methods related to color (e.g., getColor())
	  default void draw() {
	    System.out.println("Drawing a colored shape");
	  }
}

class Rectangle implements Shape, Colored {

	  @Override
	  public void draw() {
	    // Diamond problem: which draw() to call?
	    // Use super keyword for explicit call
	    Shape.super.draw(); // Call draw() from Shape
	    Colored.super.draw();
	  }
	  
	  // Implement other methods specific to Rectangle
	}

	public class Main {
	  public static void main(String[] args) {
	    Rectangle rectangle = new Rectangle();
	    rectangle.draw();
	    }
}
