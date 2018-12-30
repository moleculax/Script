public class Person2 {   
  
  // begin scope of int age
  private int age = 34; 
  
  public void displayName() {   
    
    // begin scope of String name
    String name = "Peter Simmons";
    System.out.println("My name is " + name + " and I am " + age );
  
  }   // end scope of String name

  public String getName () {
    
    return name; // this causes an error
  }
}   // end scope of int age
