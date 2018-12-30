import javax.swing.JOptionPane;
	public class sum {

	public static void main(String args[]) {
	
	String pNumero;
	String sNumero;
	String sumNumero;
	int num0;
	int num1;
	int sum;
	
	pNumero = JOptionPane.showInputDialog("Numero 0");
	sNumero = JOptionPane.showInputDialog("Numero 1");
	
	num0 = Integer.parseInt(pNumero);
	num1 = Integer.parseInt(sNumero);

	sum = num0+num1;

	System.out.println("La suma es: "+sum);
	System.exit(0);
						}

			}
