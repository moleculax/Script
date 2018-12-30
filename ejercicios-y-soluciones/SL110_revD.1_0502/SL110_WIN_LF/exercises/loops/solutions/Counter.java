public class Counter {
  
  public int count = 1;
  public final int MAX_COUNT = 100;
     
  public void displayCount() {   
        
    while (count <= MAX_COUNT) {

      System.out.println("" + count);

      count = count + 1;
            
    }// end while      
  }// end displayCount method    
}// end class


