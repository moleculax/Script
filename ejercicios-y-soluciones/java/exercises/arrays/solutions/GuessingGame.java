public class GuessingGame {

    public static void main (String args[]) {

      int randomNum = 0;
      int argument;
	
      if (args.length == 0  || args[0].compareTo("help") == 0) {
	
	System.out.println("Usage: HelpTest [argument]");
	System.out.println();
	System.out.println("help print this help message");
	System.out.println("Enter 1-5 as your guess");
      }
      else {
	  
	randomNum =((int)( Math.random()*5)+1);

	argument = Integer.parseInt(args[0]);
	
	if (argument < 1 || argument > 5) {
	  System.out.println("Invalid Argument");
	}
	else {
	  if (argument == randomNum) {
	    System.out.println("Great Guess - You got it right!");
	  }
	  else {
	    System.out.println("Sorry, the number was " + randomNum 
			       + ", Try again");
	  }
	}
      }
    
} // end main 
} // end class
