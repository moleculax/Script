public class Person {

		public int edad = 85;
		
		public void calculateAge() {
		
		
		int diasvividos = edad*365;
		long horasvividas =diasvividos*24;
		long segundosvividos =horasvividas*3600;
		
		
		System.out.println("Tu edad:  "+ edad);
		System.out.println("Dias vividos:  "+ diasvividos);
		System.out.println("Horas vividas:  "+ horasvividas);
		System.out.println("Segundos vividos:  "+ segundosvividos);
		
		
					}
			}
			