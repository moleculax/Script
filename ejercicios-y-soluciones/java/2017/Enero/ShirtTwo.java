public class ShirtTwo {

	public int shirtID = 0;
	public String description = "-Descripción requerida-";
	public char colorCode ='U';
	public double price = 0.0;

	public void setShirtInfo (int ID, String desc, double cost) {
		
		shirtID = ID;
		description = desc;
		price = cost;	
	
		}

	public void setShirtInfo(int ID, String desc, double cost, char color){
	
		shirtID = ID;
		description = desc;
		price = cost;
		colorCode = color;	
	
	}
	
	public void display() {
	
		System.out.println("Item ID: "+ shirtID);
		System.out.println("Item descripción: "+ description);
		System.out.println("Codigo del color: "+ colorCode);		
	
	}	
	


}

