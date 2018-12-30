import java.util.*;

public class suma {
	
	
	public void resulSum() {
		float n1;
		float n2;
		float sum,mul,div;
		
		Scanner intro = new Scanner(System.in);
		
		System.out.print("Intro N1: ");
		n1 = intro.nextFloat();
		
		System.out.print("Intro N2: ");
		n2 = intro.nextFloat();
		
		sum = (float) n1+n2;
		mul = (float) n1*n2;
		div = (float) n1/n1;	
		System.out.println("Suma: "+sum+"\nMultiplicación: "+mul+"\nDivisión: "+div);
		
	}

	public static void main(String args[]) {

		suma resultado  = new suma();
		resultado.resulSum();
		//new suma().resulSum();
			
	
	}
	
	

}
