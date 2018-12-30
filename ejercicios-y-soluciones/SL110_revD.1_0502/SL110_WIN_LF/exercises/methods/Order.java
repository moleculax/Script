public class Order {

  public int orderID = 0; // Default ID for the order
  public Shirt[] Shirts = new Shirt[100]; // Max 100 shirts per order
  public double totalPrice = 0.0; // Default price for order
  public boolean status = false;
  
  public double addShirt (Shirt s) {

    int numberOfShirts = Shirts.length;

    Shirts[numberOfShirts-1] = s;

    totalPrice = totalPrice + s.price;
 
    return totalPrice;
  }
} // end of class



