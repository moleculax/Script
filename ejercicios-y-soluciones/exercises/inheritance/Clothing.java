
public class Clothing {

  private int ID = 0; // Default ID for all clothing
  private String description = "-description required-"; // default
  
  private double price = 0.0; // Default price for all clothing
  private int quantityInStock = 0; // Default quantity for all clothing
  
  private static int UNIQUE_ID=0; //Static member incremented in constructor to generate uniqueId

  public Clothing() {
    ID = UNIQUE_ID++;    
  } 

  public int getID() {
    return ID;
  }

  public void setDescription(String d) {
    description = d;
  }

  public String getDescription() {
    return description;
  }

  public void setPrice(double p) {
    price = p;
  }

  public double getPrice() {
    return price;
  }

  public void setQuantityInStock(int q) {
    quantityInStock = q;
  }

  public int getQuantityInStock() {
    return quantityInStock;
  }

} // end of class
