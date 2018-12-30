public class RectangleTwoTest {

  public static void main(String args[]) {

    RectangleTwo r1;
    r1 = new RectangleTwo();

    System.out.println("This is the first rectangle:");
    r1.draw();

    RectangleTwo r2;
    r2 = new RectangleTwo(20, 7);

    System.out.println("This is the second rectangle:");
    r2.draw();

    System.out.println("The area is " + r2.getArea());
	
  }// end main
} // end class
