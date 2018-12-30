import java.util.*;

public class Person {
		
	public int ageYears; 
	public String name;
	public void calculateAge() {
		System.out.println("Tu nombre: ");
		Scanner nom = new Scanner(System.in);
		name = nom.next();
		System.out.println("Intro. edad: ");
		Scanner age = new Scanner(System.in);
		ageYears = age.nextInt();
		
		//se usa casting para evitar errores
		
		int ageDays = (int) ageYears * 365;
		long ageSeconds =  (long) ageYears * 365 * 24 * 60 * 60; 
		System.out.println("/////////////////////////////////////");
		System.out.println("Hola "+name);
		System.out.println("Tienes: "+ ageDays + " dias de viejo");
		System.out.println("Tienes: "+ ageSeconds + " Segundos de viejo");
		System.out.println("/////////////////////////////////////");
	
	}
}