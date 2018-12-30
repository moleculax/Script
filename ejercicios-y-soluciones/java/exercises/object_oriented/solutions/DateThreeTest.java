public class DateThreeTest {

  public static void main(String args[]) {

    DateThree d = new DateThree();
    int days;
    
    d.setMonth(3);
    d.setDay(9);
    d.setYear(1967);

    d.setDate(10, 2, 2002);
 
    days = d.calcDaysInMonth();
    System.out.println("Days in Month:" + days);

    d.display();

  } // end main
} // end class
