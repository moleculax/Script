import java.util.*;

public class IfElseDate {

	public int month;
	
	
	
		
		public void calculateNumDays() {
			
		Scanner number;
		number = new Scanner(System.in);
		System.out.println("Introduzca número de mes:  ");
		month = number.nextInt();
		
		
		
		if (month ==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

		System.out.println("El mes: "+month+" tiene 31 días");

}		
		else if (month == 2) { 
		
		System.out.println("El mes: "+month+" tiene 28 días");
		
	}
		
		else if (month == 4 || month == 6 || month == 9 || month == 9 || month == 11) {
		
		System.out.println("El mes: "+month+" tiene 30 días");		
		
		}
		
		else {

		System.out.println("Mes invalido");		
		
		}
		
		}



}