
public class Customer {

  public int customerID = 0; // Default ID for the customer
  public String name = "-name required-"; // default
  public String address = "-address required-"; // default
  public String phoneNumber = "-phone required="; // default
  public String emailAddress = "-email required-"; // default
  public char status = 'N'; // default
  public double totalPurchases = 0.0; // default

  // This method displays the values for an item
  public void displayCustomerInfo() {
  
    System.out.println("Customer ID: " + customerID);
    System.out.println("Name:" + name);
    System.out.println("Address: " + address);
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("Email: " + emailAddress);
    System.out.println("Status: " + status);
    System.out.println("Purchases: " + totalPurchases);

  } // end of display method
} // end of class



