class ShirtTwoTest {
   
  public static void main (String args[]) {
    ShirtTwo shirtOne = new ShirtTwo();
    ShirtTwo shirtTwo = new ShirtTwo();
    ShirtTwo shirtThree = new ShirtTwo();
 
    shirtOne.setShirtInfo(100, "Button Down", 12.99);
    shirtTwo.setShirtInfo(101, "Long Sleeve Oxford", 27.99, 'G');
    shirtThree.setShirtInfo(102, "Shirt Sleeve T-Shirt", 9.99, 'B', 50);

    shirtOne.display();
    shirtTwo.display();
    shirtThree.display();
  } 
}
