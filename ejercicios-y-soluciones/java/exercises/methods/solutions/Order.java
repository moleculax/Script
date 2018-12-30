public class Order {

  public double totalPrice = 0.0; // Default price for order
  
  public double addShirt (Shirt s) {

    totalPrice = totalPrice + s.price;
 
    return totalPrice;
  }
} // end of class



