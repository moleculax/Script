/** 
 * DemoTextArea.java
 *
 * Description: 
 * @author   coti
 * @version   
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.io.*;
import java.lang.Runtime;
import java.util.StringTokenizer;


public class DemoTextArea extends KeyAdapter {
 JTextArea jta;
 boolean ejecutando;
 public DemoTextArea() {
  JFrame jf = new JFrame("Demostración de TextArea");
  jta = new JTextArea(25,80);
  jta.setForeground(Color.green);
  jta.setBackground(Color.black);
  jta.setFont(new Font("Monospaced", Font.PLAIN, 12));
  JScrollPane jsp = new JScrollPane(jta);
  jta.setLineWrap(true);
  jta.setWrapStyleWord(true);
  jta.addKeyListener(this);
  /*
   jta puede solicitar el foco.
  */
  jta.setRequestFocusEnabled(true);
  jf.getContentPane().add(jsp);
  jf.pack();
  jf.setVisible(true);
  jf.addWindowListener(new WindowAdapter() {
   public void windowClosing(WindowEvent we) {
    System.exit(0);
   }
  });
  /*
   Este es el momento de solicitar el foco.
  */
  jta.requestFocus();
  jta.append("Escriba sus órdenes...\n\n");
  jta.getCaret().setDot(jta.getText().length());
 }
 public void ejecutar(String orden) {
  StringBuffer texto = new StringBuffer();
     try
      {
    String linea = null;

    Process p = Runtime.getRuntime().exec(orden);
    
    BufferedReader rs = new BufferedReader(new InputStreamReader(p.getInputStream()));
    
    linea = "*";
    while (null != linea) {
     linea = rs.readLine();
     System.out.println(linea);
     if (null != linea)
      texto.append(linea+"\n");
    }
    rs.close();
       } 
     catch (Exception err)
      {
        texto = new StringBuffer("Perdon, esa orden no es válida.\n");
        System.out.println("\nLa excepción es: "+err);
       }
      jta.append(texto.toString());
    }//Ejecutar(orden)

 public void keyTyped(KeyEvent ke) {
  char tecla = ke.getKeyChar();
  if (!ejecutando && tecla=='\n')
   {
    String tx = jta.getText(), orden;
    int pos = tx.lastIndexOf("\n", tx.length()-2);
    orden = tx.substring(pos+1);
    System.err.println("La orden es " + orden);
    ejecutando=true;
    ejecutar(orden);
    ejecutando=false;
   };
  super.keyTyped(ke);
 }
 static public void main(String[] args) {
  new DemoTextArea();
 }
 
}
