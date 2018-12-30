public class ConstructorShirt2Test {

  public static void main (String args[]) {

    ConstructorShirt2 constShirtFirst = new ConstructorShirt2();
    ConstructorShirt2 constShirtSecond = new ConstructorShirt2('G');
    ConstructorShirt2 constShirtThird = new ConstructorShirt2('B', 1000);
    
    char colorCode;
    int quantity;

    colorCode = constShirtFirst.getColorCode();
    System.out.println("Object 1 Color Code: " + colorCode);

    colorCode = constShirtSecond.getColorCode();
    System.out.println("Object 2 Color Code: " + colorCode);

    colorCode = constShirtThird.getColorCode();
    quantity = constShirtThird.getQuantityInStock();
    System.out.println("Object 3 Color Code: " + colorCode);
    System.out.println("Object 3 Quantity on Hand: " + quantity);
  }
}
