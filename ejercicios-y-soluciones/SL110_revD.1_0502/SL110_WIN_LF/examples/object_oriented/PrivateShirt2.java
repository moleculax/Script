public class PrivateShirt2 {

  private int shirtID = 0; // Default ID for the shirt
  private String description = "-description required-"; // default
  
  // The color codes are R=Red, B=Blue, G=Green, U=Unset
  private char colorCode = 'U';
  private double price = 0.0; // Default price for all items
  private int quantityInStock = 0; // Default quantity for all items

  public char getColorCode() {
    return colorCode;
  }

  public void setColorCode(char newCode) {
    
    switch (newCode) {
    case 'R': 
    case 'G': 
    case 'B':
      colorCode = newCode;
      break;
    default:
      System.out.println("Invalid colorCode. Use R, G, or B");
    }
  }

  // Additional get and set methods for shirtID, description,
  // price, and quantityInStock would follow

} // end of class
