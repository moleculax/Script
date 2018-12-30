public class Customer {

  public int customerID = 0; // Default ID for the customer
  public char status = 'N'; // default
  public double totalPurchases = 0.0; // default

  // This method displays the values for an item
  public void displayCustomerInfo() {
  
    System.out.println("Customer ID: " + customerID);
    System.out.println("Status: " + status);
    System.out.println("Purchases: " + totalPurchases);


  } // end of display method
} // end of class
