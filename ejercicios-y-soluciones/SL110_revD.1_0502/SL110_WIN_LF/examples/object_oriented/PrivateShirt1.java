public class PrivateShirt1 {

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
    colorCode = newCode;
  }

  // Additional get and set methods for shirtID, description,
  // price, and quantityInStock would follow

} // end of class
