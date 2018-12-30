public class OrderTest {
   
  public static void main (String args[]) {
    Order myOrder = new Order();
    Shirt shirtOne = new Shirt();
    Shirt shirtTwo = new Shirt();
    Shirt shirtThree = new Shirt();
    double totalPrice = 0.0;
    
    shirtOne.price = 14.00;
    shirtTwo.price = 9.00;
    shirtThree.price = 12.00;

    totalPrice = myOrder.addShirt(shirtOne);

    System.out.println("Total amount for this order is: " + totalPrice);

    totalPrice = myOrder.addShirt(shirtTwo);

    System.out.println("Total amount for this order is: " + totalPrice);

    totalPrice = myOrder.addShirt(shirtThree);

    System.out.println("Total amount for this order is: " + totalPrice);


  } 
}
