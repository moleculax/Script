public class Sequence {
 
  public int firstNumber = 1;
  public int secondNumber = 1;

  public void displaySequence() {

    System.out.println(firstNumber);
    System.out.println(secondNumber);

    while (secondNumber < 100) {
      secondNumber = firstNumber + secondNumber; // New second number
      firstNumber = secondNumber - firstNumber; // New first number

      System.out.println(secondNumber);
    }  
  }
}// end class


