public class Sock extends Clothing {

  // The color codes are R=Red, B=Blue, G=Green, U=Unset
  public char colorCode = 'U';
  
  // This method displays the values for an item
  public void displaySockInformation() {
  
    System.out.println("Sock ID: " + getID());
    System.out.println("Sock description:" + getDescription());
    System.out.println("Color Code: " + colorCode);
    System.out.println("Sock price: " + getPrice());
    System.out.println("Quantity in stock: " + getQuantityInStock());

  } // end of display method
} // end of class



