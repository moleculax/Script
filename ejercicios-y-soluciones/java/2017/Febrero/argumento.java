import java.util.*;
public class argumento {
	
	
	
	public void sum(int a, int b){
	
	int result = a + b;
	
	System.out.println(result);
	
	}	
	
	public void mul(int a, int b){
	
	int mult = a*b;
	System.out.println(mult);	
		
	}
	
	public static void main(String[] args){
	
	int a;
	int b;
	Scanner introA = new Scanner(System.in);
	Scanner introB = new Scanner(System.in);
	System.out.println("Intro valor A: ");
	a = introA.nextInt();
	System.out.println("Intro valor B: ");
	b = introB.nextInt();
	
	
	argumento argu = new argumento();
	argu.sum(a,b);
	argu.mul(a,b);
	
	
	
			
	
	}

}