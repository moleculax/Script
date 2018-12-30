public class ConstructorShirt2 {

  private int shirtID = 0; // Default ID for the shirt
  private String description = "-description required-"; // default
  
  // The color codes are R=Red, B=Blue, G=Green, U=Unset
  private char colorCode = 'U';
  private double price = 0.0; // Default price for all items
  private int quantityInStock = 0; // Default quantity for all items

  public ConstructorShirt2() {
    colorCode = 'R';
  }
  
  public ConstructorShirt2 (char startingCode) {

    switch (startingCode) {
    case 'R': 
    case 'G': 
    case 'B':
      colorCode = startingCode;
      break;
    default:
      System.out.println("Invalid colorCode. Use R, G, or B");
    }
  }

 public ConstructorShirt2 (char startingCode, int startingQuantity) {

    switch (startingCode) {
    case 'R': 
      colorCode = startingCode;
      break;
    case 'G': 
      colorCode = startingCode;
      break;
    case 'B':
      colorCode = startingCode;
      break;
    default:
      System.out.println("Invalid colorCode. Use R, G, or B");
    }

    if (startingQuantity > 0 || startingQuantity < 2000) {
      quantityInStock = startingQuantity;
    }
  
    else {
      System.out.println("Invalid quantity. Must be > 0 or < 2000");
    }
 }

  public char getColorCode() {
    return colorCode;
    }


  public int getQuantityInStock() {
      return quantityInStock;
  }

} // end of class

