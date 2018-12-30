public class ShirtTestTwo {
   
  public static void main (String args[]) {
 
    Shirt myShirt = new Shirt();
    Shirt yourShirt = new Shirt();
  
    myShirt.displayShirtInformation();
    yourShirt.displayShirtInformation();

    myShirt.colorCode='R';
    yourShirt.colorCode='G';

    myShirt.displayShirtInformation();
    yourShirt.displayShirtInformation();

  } 
}

