public class PrivateShirt1Test {
   
  public static void main (String args[]) {

  PrivateShirt1 privShirt = new PrivateShirt1();
  char colorCode;
  
  // Set a valid colorCode
  privShirt.setColorCode('R');
  colorCode = privShirt.getColorCode();
 
  // The PrivateShirtTest1 class can set a valid colorCode
  System.out.println("Color Code: " + colorCode);
  
  // Set an invalid color code
  privShirt.setColorCode('Z');
  colorCode = privShirt.getColorCode();
 
  // The PrivateShirtTest1 class can set an invalid colorCode
  System.out.println("Color Code: " + colorCode);
  } 
}
