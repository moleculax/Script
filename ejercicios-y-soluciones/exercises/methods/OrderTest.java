public class OrderTest {

				
		public static void main (String args[]) {
		
		Order myOrder  = new Order();
		Shirt  myShirt = new Shirt();
								
		myShirt.price = 14.00;
		myOrder.addShirt(myShirt);
		
		System.out.println("Total " + myOrder.totalPrice);
					
						        }				
			}
		
		
		