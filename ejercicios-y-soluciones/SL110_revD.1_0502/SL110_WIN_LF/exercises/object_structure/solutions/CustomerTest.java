public class CustomerTest {
   
  public static void main (String args[]) {
 
    Customer myCustomer = new Customer();

    myCustomer.customerID = 121;
    myCustomer.status = 'O';
    myCustomer.totalPurchases = 100.00;
  
    myCustomer.displayCustomerInfo();
  } 
}

