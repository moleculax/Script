public class Calculator {

	public  int sum(int numberOne, int numberTwo) {
		
		//Se usa un cast para evitar errores en el calculo.
		System.out.println("Método uno");
		return (int) numberOne + numberTwo;	
		}
		
	public float sum(float numberOne, float numberTwo) {

		System.out.println("Método dos");	
		return (float) numberOne + numberTwo;
	}
	
	public float sum(int numberOne, float numberTwo,int numberFour){

		System.out.println("Método tres");
		return (float) numberOne + numberTwo + numberFour;	
	
	}

}

