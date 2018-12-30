public class SequenceThree {
 
  public int firstNumber = 1;
  public int secondNumber = 1;
  public static final int MAX_NUMBERS = 11;
  public int count = 3;

  public void displaySequence() {

    System.out.println("1 : " + firstNumber);
    System.out.println("2 : " + secondNumber);

    do {   
      secondNumber = firstNumber + secondNumber; // New second number
      firstNumber = secondNumber - firstNumber; // New first number
      System.out.println(count + " : " + secondNumber);
      ++count;
    }
    while (count < MAX_NUMBERS);  
  }
}// end class


