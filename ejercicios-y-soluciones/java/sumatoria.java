/* Este pequeño programa lee n(i) numeros y los suma
Emilio J. Gomez
moleculax@gmail.com
Cumana, 15/08/2006
 */


import javax.swing.JOptionPane;

	public class sumatoria {
	public static void main(String args[]) {
	
	String numN;
	String num_I;
	int cant_N;
	int    num_i;
	int i;
	int sum_i;
	

	numN = JOptionPane.showInputDialog("CANTIDAD DE NUMEROS:");
	cant_N =  Integer.parseInt(numN);
	sum_i=0;
	
	for (i=0;i<cant_N;++i){

	num_I = JOptionPane.showInputDialog("Tienes que Introducir: "+cant_N,"Suma parcial ->  "+sum_i);
	num_i = Integer.parseInt(num_I);

	sum_i=sum_i+num_i;
			}
	System.out.println("Resultado: "+sum_i);
	
	JOptionPane.showMessageDialog(null,"RESULTADO DE LA SUMA:\n "+sum_i,"  ",JOptionPane.PLAIN_MESSAGE);
	
	System.exit(0);
						}
				}


	
