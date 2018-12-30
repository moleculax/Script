public class Person {

  public int ageYears = 100;
  public int ageDays;
  public long ageSeconds, ageMinutes, ageMilliseconds;
    
  public void calculateAge() {
    
        int ageDays = ageYears * 365;
        long ageSeconds = ageYears * 365L * 24 * 60 * 60;
    
        long ageMinutes = ageSeconds / 60;
        long ageMilliseconds = ageSeconds * 1000; 
    
        System.out.println("You are " + ageDays + " days old.");
        System.out.println("You are " + ageSeconds + " seconds old.");
        System.out.println("You are " + ageMinutes + " minutes old.");
        System.out.println("You are " + ageMilliseconds + " milliseconds old.");

    } // end calculateAge
} // end class 
