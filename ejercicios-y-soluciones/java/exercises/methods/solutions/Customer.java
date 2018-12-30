public class Customer {

  public int customerID = 0; // Default ID for the customer
  public String name = "-name required-"; // default
  public String address = "-address required-"; // default
  public String phoneNumber = "-phone required-"; // default
  public String eMailAddress = "-email required -"; // default
  
  // This method is used for customer's who don't have email
  public void setCustInfo(int ID, String n, String a, String p) {
    customerID = ID;
    name = n;
    address = a;
    phoneNumber = p;
  }

  // This method is used for customer's who have email
  public void setCustInfo(int ID, String n, String a, String p, 
			  String e) {
    customerID = ID;
    name = n;
    address = a;
    phoneNumber = p;
    eMailAddress = e;
  }

  public void display() {

    System.out.println("Customer ID: " + customerID);
    System.out.println("Name:" + name);
    System.out.println("Address: " + address);
    System.out.println("Phone: " + phoneNumber);
    System.out.println("E-Mail (optional): " + eMailAddress);
  } // end of display method
} // end of class
