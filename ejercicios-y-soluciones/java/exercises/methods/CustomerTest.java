public class CustomerTest {
   
  public static void main (String args[]) {
 
  Customer customerOne = new Customer();
  Customer customerTwo = new Customer();
  
  customerOne.setCustInfo(12111, "Joe Smith", "3427 Boulder Street", "555-2777");

  customerTwo.setCustInfo(12112, "Claire Jones", "27 Grimsby Dr.", "555-2767", 
			      "someone@somewhere.gov");

  customerOne.display();
  customerTwo.display();
  } 
}
