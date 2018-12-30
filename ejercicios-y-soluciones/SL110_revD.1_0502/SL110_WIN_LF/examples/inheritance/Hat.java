public class Hat extends Clothing {

  // The color codes are R=Red, B=Blue, G=Green, U=Unset
  public char colorCode = 'U';
  
  // This method displays the values for an item
  public void displayHatInformation() {
  
    System.out.println("Hat ID: " + getID());
    System.out.println("Hat description:" + getDescription());
    System.out.println("Color Code: " + colorCode);
    System.out.println("Hat price: " + getPrice());
    System.out.println("Quantity in stock: " + getQuantityInStock());

  } // end of display method
} // end of class



