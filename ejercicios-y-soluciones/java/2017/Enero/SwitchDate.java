import java.util.*;

public class SwitchDate {

public int month;

public void calNumDays() {

	Scanner number;
	number = new Scanner(System.in);
	System.out.println("Introduzca número de mes: ");
	month = number.nextInt();

	switch(month) {
	
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("El mes tiene 31 días");
		break;
	case 2:
		System.out.println("El mes tiene 28 días");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
	System.out.println("El mes tiene 30 días");
	break;
	default:
	System.out.println("Mes invalido");
	break;
	
		}
	
	


}

public static void main(String[] args) {

new SwitchDate().calNumDays();

}

}