public class DateThree {

  private int day;
  private int month;
  private int year;

  public void setDay(int d) {
    day = d;
  }

  public int getDay() {
    return day;
  }

  public void setMonth(int m) {
    month = m;
  }

  public int getMonth() {
          return month;
  }

  public void setYear(int y) {
    year = y;
  }

  public int getYear() {
    return year;
  }

  public int calcDaysInMonth() {

    switch(month) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
      return 31;
    case 2:
      return 28;
    case 4:
    case 6:
    case 9:
    case 11:
      return 30;
    default:
      System.out.println("Invalid month.");
      return 0;
    }
  }

  public void setDate (int m, int d, int y) {
    
    if ((y > 1800) && (y < 10000)) {
      year = y;
    }      
    else {
      System.out.println("Invalid year. Must be > 1800 and < 10000)");
    }
      
    switch(m) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
      month = m;
      
      if ((d > 0) && (d < 32)) {
	day = d;
      }
      else {
	System.out.println("Invalid day. Must be 1 to 31.");
      }
      break;
    case 2:
      month = m;
      
      if ((d > 0) && (d < 29)) {
	day = d;
      }
      else {
	System.out.println("Invalid day. Must be 1 to 28.");
      }
      break;
    case 4:
    case 6:
    case 9:
    case 11:
      month = m;
      
      if ((d > 0) && (d < 31)) {
	day = d;
      }
      else {
	System.out.println("Invalid day. Must be 1 to 30.");
      }
      break;
    default:
      System.out.println("Invalid month.");
      break;
     }
   }

  public void display() {
    
    System.out.println("Today's date is: " + month + "/" + day + "/" + year);
  }
 
} // end class
