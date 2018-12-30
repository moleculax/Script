public class SequenceTwo {
 
  public int firstNumber = 1;
  public int secondNumber = 1;
  public static final int MAX_NUMBERS = 10;

  public void displaySequence() {

    System.out.println(firstNumber);
    System.out.println(secondNumber);

    for (int i = 3; i < MAX_NUMBERS; i++) {
 
      secondNumber = firstNumber + secondNumber; // New second number
      firstNumber = secondNumber - firstNumber; // New first number
      System.out.println(secondNumber);
    }  
  }
}// end class


