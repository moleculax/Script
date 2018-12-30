public class RectangleTest {

  public static void main(String args[]) {

    Rectangle r1;
    r1 = new Rectangle();

    Rectangle r2;
    r2 = new Rectangle();
    
    r1.setWidth(15);
    r1.setHeight(5);
    
    r2.setWidth(20);
    r2.setHeight(7);
    
    System.out.println("This is the first rectangle:");
    r1.draw();
    
    System.out.println("This is the second rectangle:");
    r2.draw();
    
    System.out.println("The area is " + r2.getArea());
	
  }// end main
} // end class
