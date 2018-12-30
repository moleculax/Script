public class Clothing {

  private int ID = 0; // Default ID for all clothing
  private String description = "-description required-"; // default
  
  private double price = 0.0; // Default price for all clothing
  private int quantityInStock = 0; // Default quantity for all clothing
  
  public void calculateID() {
    int uniqueID;

    uniqueID =((int)( Math.random()*10000)+1);

    ID = uniqueID;    
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
