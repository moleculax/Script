public class ShirtArrayTest {



	public static void main (String[] args) {
	
	int i;
	
	Shirt  camisa0 = new Shirt(01," Camisa 01 ",'A',100.2,1500);
	Shirt  camisa1 = new Shirt(02," Camisa 02 ",'B',200.5,2000);
	
	Shirt lascamisas[] = {camisa0,camisa1};
	
	for (i=0;i<2;++i) {
	
	lascamisas[i].displayShirtInformation();
	
				}
	}
	
	
						
						
			} 
			
			
				