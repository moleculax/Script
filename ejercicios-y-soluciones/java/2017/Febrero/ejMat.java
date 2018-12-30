import java.lang.*;

public class ejMat {
	
	public void mat() {

double n1 = 3.3;
int n2 = 4;
int n3 = 5;
float d,rd,rm;
float m;
d = (float) n1*n2/n3;
m = (float) n1*n2*n3;
rd = (float) Math.sqrt(d);
rm = (float) Math.sqrt(m);
float rc = (float) Math.pow(n1,n2);
		System.out.println("División:  "+d);
		System.out.println("Multiplicación:  "+m);
		System.out.println("Raiz de la división:  "+rd);
		System.out.println("Raiz de la multiplicación:  "+rm);
		System.out.println("n1 elevado a n2:  "+rc);
		}

	public void linea(){

	System.out.println("\n ------------------------------\n");
	
	}
		/*
		public static void main(String[] args) {
		
		ejMat resul = new ejMat();
		resul.linea();	
		resul.mat();	
		resul.linea();	
		
		
		} */
}

