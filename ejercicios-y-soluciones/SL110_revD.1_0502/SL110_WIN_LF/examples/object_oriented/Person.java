class Person {
  
  public int ageYears = 32;
  public int ageDays = 0;
  public long ageSeconds = 0;

  void calculateAge() {

    ageDays = ageYears * 365;
    ageSeconds = ageYears * 365 * 24L * 60 * 60;

    System.out.println("You are " + ageDays + " days old.");
    System.out.println("You are " + ageSeconds + " seconds old."); 
  
  } // end of calculateAge method
} // end of class
