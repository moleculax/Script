public class factorial {
  public static void main (String[] args) {
    int n= 4;
    int f= 1; // También puede ser double

    for (int i= 1; i<= n; i++)
      f= f*i;

    System.out.println("El factorial de "+n+" es "+f);
      }
}
