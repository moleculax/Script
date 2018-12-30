import java.util.*;
public class sumandoN {

public void leeN() {

	float n1;
	float n2;
	float n3;
	float R1;
	float R2;
	

	Scanner introN1 = new Scanner(System.in);
	Scanner introN2 = new Scanner(System.in);
	Scanner introN3 = new Scanner(System.in);
	
	System.out.print("Intro primer valor: ");
	n1 = introN1.nextFloat();
	
	System.out.print("Intro segundo valor: ");
	n2 = introN2.nextFloat();
	
	System.out.print("Intro tercer valor: ");	
	n3 = introN3.nextFloat();

	R1 = (float) n1+n2+n3;
	R2 = (float)(n1/n2)*n3;

	System.out.println("n1+n2+n3 = "+R1);
	System.out.println("(n1/n2)*n3 = "+R2);
	
}

public static void main(String[] args) {

	sumandoN resul = new sumandoN();
	resul.leeN();
	
	MatSumando result = new MatSumando();
	result.linea();	
	result.mat();	
	result.linea();	
	
		capturaDatos intro = new capturaDatos();
		intro.printerDat();
		intro.datosPersonales();
		intro.printerDat();

}

}