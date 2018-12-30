public class Rectangle {
 
  private int width, height;

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
    } // end for   
  }// end draw  
}// end class
