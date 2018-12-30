public class PrivateShirt2Test {
   
  public static void main (String args[]) {

  PrivateShirt2 privShirt = new PrivateShirt2();
  char colorCode;
  
  // Set a valid colorCode
  privShirt.setColorCode('R');
  colorCode = privShirt.getColorCode();
 
  // The PrivateShirtTest2 class can set a valid colorCode
  System.out.println("Color Code: " + colorCode);
  
  // Set an invalid color code
  privShirt.setColorCode('Z');
  colorCode = privShirt.getColorCode();
 
  // The PrivateShirtTest2 class cannot set an invalid colorCode.
  // Color code is still R
  System.out.println("Color Code: " + colorCode);
  } 
}
