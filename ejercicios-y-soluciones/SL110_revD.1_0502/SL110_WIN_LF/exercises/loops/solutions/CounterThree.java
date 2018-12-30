public class CounterThree {
  
  public final int MAX_COUNT = 100;
  public int count = 1;
     
  public void displayCount() {   
        
    do {
      System.out.println("" + count);
      ++ count;
    }
    while (count <= MAX_COUNT);
      
  }// end displayCount method    
}// end class


