public class RectangleTwo {

  private int width, height;

  public RectangleTwo() {

    width=25;
    height=10;
    System.out.println("Default rectangle created: width=25, height=10");
  }

  public RectangleTwo(int w, int h) {
    if (w > 0 && w < 30 && h > 0 && h < 30) {

      width=w;
      height=h;
      System.out.println("Rectangle created: width=" + w +
			 ", height=" + h);
    }
    else {
      System.out.println("Invalid value: width and height must be" +
			 " positive and less than 30");
    }
  }
	    
  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }
  
  public void setWidth(int w) {
    if (w > 0 && w < 30) {
      width = w;
    }
    else {
      System.out.println("Invalid Width");
    }
  }
  
  public void setHeight(int h) {

    if (h > 0 && h < 30) {
      height = h;
    }
    else {
      System.out.println("Invalid height");
    }
  }
  
  public int getPerimeter() {
    return width + width + height + height;
  }
  
  public int getArea() {
    return width * height;
  }
  
  public void draw() {
    for (int rowCounter = 0; rowCounter < height; rowCounter++) {
      for (int colCounter = 0; colCounter < width; colCounter++) {
	System.out.print("*");
	System.out.println();
      } // end for
    }// end for
  }// end draw  
}// end class
