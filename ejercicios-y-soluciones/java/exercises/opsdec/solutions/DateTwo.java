public class DateTwo {

  public int day = 1;

  public void displayDay() {

    if (day == 1) {
      System.out.println("Monday");
    }
    else if (day == 2) {
      System.out.println("Tuesday");
    }
    else if (day == 3) {
      System.out.println("Wednesday");
    }
    else if (day == 4) {
      System.out.println("Thursday");
    }
    else if (day == 5) {
      System.out.println("Friday");
    }
    else if (day == 6) {
      System.out.println("Saturday");
    }
    else if (day == 7) {
      System.out.println("Sunday");
    }
    else {
      System.out.println(day + " entered. This is not a valid date.");
    }		
  }//end main
}//end class
