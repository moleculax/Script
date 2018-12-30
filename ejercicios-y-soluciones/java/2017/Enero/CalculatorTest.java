public class CalculatorTest {

public static void main(String[] args) {

	int totalOne = new Calculator().sum(10,10);
		System.out.println(totalOne);

	float totalTwo = new Calculator().sum(2.1F,2.2F);
		System.out.println(totalTwo);

	float totalThree = new Calculator().sum(1,2.35F,4);
		System.out.println(totalThree); 

}


}