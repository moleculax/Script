import java.util.*;
public class multiPlica {

	
		public void tabMul() {
			int i;
			float tm;
			float n;
			Scanner numero;
			
			System.out.println("------------------------------------------------------");	
			System.out.println("TABLA DE MULTIPLICAR PARA NUMEROS ENTEROS Y DECIMALES.");
			System.out.println("INTRO. NUMERO");
			
			numero = new Scanner(System.in);
			n = numero.nextFloat();
			System.out.println("RESULTADOS");	
			
			for (i=0; i<=10; i++){
				tm=	n*i;	
				System.out.println("("+n+")x("+i+") = "+tm+"");		
			
			
			}
			System.out.println("------------");	
	
	}


}