import javax.swing.JOptionPane;
	public class No {
	public static void main(String args[]) {
	
	String pNumero;
	String pNumero0;
	int num0;
	int num1;
	int nivel;
	
	pNumero = JOptionPane.showInputDialog("Dame el valor numerico que aspiras o crees");
	pNumero0 = JOptionPane.showInputDialog("Dame la cifra  que tu crees");
	num0 = Integer.parseInt(pNumero);
	num1 = Integer.parseInt(pNumero0);
	nivel = num0*num1/100;

	System.out.println("El niver aspirado seria: "+nivel+" porciento");
	System.exit(0);
						}
			}
