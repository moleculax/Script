import java.lang.*;

public class GuessingGameTest {

    public static void main (String args[]) {

      int argument = 0;
      int randomNum = 0;
	
      if (args[0].compareTo("-help") == 0) {
	
	System.out.println("Usage: HelpTest [-arguments]");
	System.out.println("-help print this help message");
      }
      else {
	  
	randomNum =((int)( Math.random()*100));
	System.out.println(randomNum);

	argument = Integer.parseInt(argument);
	
	switch (argument) {

	  
	case 1: System.out.println("Yes, you got it right");
	  break;
	case 2: System.out.println("No, that's not it");
	  break;
	case 3: System.out.println("No, that's not it");
	default: System.out.println("Invalid choice, try again.");
	}
      }
} // end main 
} // end class
