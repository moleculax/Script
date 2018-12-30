public class DefaultShirt {

  private int shirtID = 0; // Default ID for the shirt
  private String description = "-description required-"; // default
  
  // The color codes are R=Red, B=Blue, G=Green, U=Unset
  private char colorCode = 'U';
  private double price = 0.0; // Default price for all items
  private int quantityInStock = 0; // Default quantity for all items

  public DefaultShirt() {
    colorCode = 'R';
  }
  
  public char getColorCode() {
    return colorCode;
  }
} // end of class

