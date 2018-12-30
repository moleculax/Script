class Customer {

	
	
	public int identificador_cliente;
	public int tlf_cliente;
	public String nombre_cliente;
	public String direccion_cliente;
	public String email_cliente;
	
	public void setCustomerInfo(int ID, String name, String addres, int phone) {
	
	identificador_cliente = ID;
	nombre_cliente = name;
	direccion_cliente = addres;
	tlf_cliente = phone;
	
	
		
	
							  }
	public void setCustomerInfo(int ID, String name, String addres, int phone,String email) {
	
		setCustomerInfo (ID,name,addres,phone);
		email_cliente = email;
	
	
	}						  
					
	public void imprimelo() {
	
	System.out.println("IDENTIFICADOR: "+identificador_cliente);
	System.out.println("NOMBRE DEL CLIENTE: "+nombre_cliente);
	System.out.println("DIRECCION DEL CLIENTE: "+direccion_cliente);
	System.out.println("TELEFONO DEL CLIENTE: "+tlf_cliente);
	System.out.println("EMAIL DEL CLIENTE: "+email_cliente);
				
				}
						
				
			}						                         
			
			
public class prueba {

			public static void main(String[]a) {
			
			Customer c1 = new Customer();
			Customer c2 = new Customer();
			
			c1.setCustomerInfo(1,"pepe","chacaito",4545);
			c2.setCustomerInfo(2,"maria","chacao",214554,"mm@nnn");
			c1.imprimelo();
			c2.imprimelo();
			
								}
			}
			
			
			
			
			