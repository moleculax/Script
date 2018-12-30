public class Shirt {
		public int shirtID = 0;
		public String descripcion = "Franelas azules.";
		public char colorCode = 'U';
		public double precio = 0.0;
		public int cantStop = 0;
	
	//creamos un metodo para mostrar la informacion
	
	public void displayInfo() {
	
		System.out.println("Shirt ID: "+shirtID);
		System.out.println("Descripcion: "+descripcion);
		System.out.println("Codigo del color: "+colorCode);
		System.out.println("Precio: "+precio);
		System.out.println("Cantidad: "+cantStop);
	
	}

}