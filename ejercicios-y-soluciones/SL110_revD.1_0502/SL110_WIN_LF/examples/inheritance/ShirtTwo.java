public class ShirtTwo extends Clothing {

  // The color codes are R=Red, B=Blue, G=Green, U=Unset
  public char colorCode = 'U';
  
  // This method displays the values for an item
  public void displayClothingInformation() {
  
    System.out.println("Shirt ID: " + getID());
    System.out.println("Shirt description:" + getDescription());
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: " + getPrice());
    System.out.println("Quantity in stock: " + getQuantityInStock());

  } // end of display method
} // end of class
