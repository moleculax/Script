public class ConstructorShirt1 {

  private int shirtID = 0; // Default ID for the shirt
  private String description = "-description required-"; // default
  
  // The color codes are R=Red, B=Blue, G=Green, U=Unset
  private char colorCode = 'U';
  private double price = 0.0; // Default price for all items
  private int quantityInStock = 0; // Default quantity for all items

  public ConstructorShirt1(char startingCode) {

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

    public char getColorCode() {
      return colorCode;
    }
} // end of class

