public class ConstructorShirt1Test {

  public static void main (String args[]) {

    ConstructorShirt1 constShirt = new ConstructorShirt1('R');
    char colorCode;

    colorCode = constShirt.getColorCode();

    System.out.println("Color Code: " + colorCode);
  }
}
