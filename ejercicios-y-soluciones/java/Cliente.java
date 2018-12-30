package prueba.SoloJavaMailList;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Cliente extends JFrame {

/** Creates new form Cliente */
public Cliente() {
componentes();
}

public Dimension getPreferredSize() {
Dimension size = super.getPreferredSize();
size.width = 500;
size.height = 400;
return size;
}

private void componentes() {

jPanelAbajoClientes = new JPanel();
jPanelAbajoPreguntas = new JPanel();
jPanelAbajoForos = new JPanel();
jPanelArriba = new JPanel();
jPanelAbajo = new JPanel();
nombreCliente = new JTextField();
lenguetas = new JTabbedPane();
lenguetas.setBounds(10,10,400, 50);


//////////// New code ///////////////////
jLabelAbajoForos = new JLabel( "Foros" );
jLabelAbajoPreguntas = new JLabel( "Preguntas" );
jLabelAbajoClientes = new JLabel( "Cliente" );
jPanelAbajoForos.add( jLabelAbajoForos );
jPanelAbajoPreguntas.add( jLabelAbajoPreguntas );
jPanelAbajoClientes.add( jLabelAbajoClientes );
////////////////////////////////////////


addWindowListener(new java.awt.event.WindowAdapter() {
public void windowClosing(java.awt.event.WindowEvent evt) {
exitForm(evt);
}
});

this.getContentPane().add(jPanelAbajo, BorderLayout.CENTER);
this.getContentPane().add(lenguetas, BorderLayout.NORTH);
lenguetas.add(jPanelAbajoClientes, CLIENTESPANEL);
lenguetas.add(jPanelAbajoPreguntas, PREGUNTASPANEL);
lenguetas.add(jPanelAbajoForos, FOROSPANEL);

jPanelAbajo.setLayout(null);
nombreCliente.setBounds(200,10, 100,20);
jPanelAbajo.add(nombreCliente);
pack();

}

private void exitForm(java.awt.event.WindowEvent evt) {
System.exit(0);
}

public static void main(String args[]) {
new Cliente().show();
}

// Declaramos las elmentos SWING
private JPanel jPanelArriba;
private JPanel jPanelAbajoClientes;
private JPanel jPanelAbajoForos;
private JPanel jPanelAbajo;
private JPanel jPanelAbajoPreguntas;
private JTabbedPane lenguetas;
private JTextField nombreCliente;



//////////// New code ///////////////////
private JLabel jLabelAbajoClientes,
               jLabelAbajoForos,
               jLabelAbajoPreguntas;
/////////////////////////////////////////



// Definimos como estáticas
final static String CLIENTESPANEL = "Clientes";
final static String FOROSPANEL = "Foros";
final static String PREGUNTASPANEL = "Preguntas";
private JButton jButton1;

}
