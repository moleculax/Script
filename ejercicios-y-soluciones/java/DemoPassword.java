/** 
 * DemoPassword.java
 *
 * Descripción: 
 * @author   coti
 * @version   1.1
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemoPassword extends JPanel implements ActionListener {
 JPasswordField jpf;
 JLabel resultado;
 public DemoPassword() {
  JPanel campo = new JPanel(new GridLayout(0,2));
  
  JLabel jl_pwf = new JLabel("Escriba la contraseña: ");
  resultado = new JLabel("******************");
  Font f = new Font("SansSerif", Font.PLAIN, 24);
  resultado.setFont(f);
  resultado.setHorizontalAlignment(JLabel.CENTER);

  jpf = new JPasswordField(10);
  jpf.addActionListener(this);
  
  jl_pwf.setLabelFor(jpf);
  
  campo.add(jl_pwf);
  campo.add(jpf);
  
  setLayout(new BorderLayout());
  add(campo,BorderLayout.NORTH);
  add(resultado, BorderLayout.CENTER);
 }

 public void actionPerformed(ActionEvent ae) {
  /*
   No se debe utilizar getText()
  */
  String st = new String(jpf.getPassword());
  if (st.equals("aladino"))
   resultado.setText("*****CORRECTO****");
  else
   resultado.setText("NO ES CORRECTO");
 }
 static public void main(String[] args) {
  JFrame jf = new JFrame();
  jf.getContentPane().add(new DemoPassword());
  jf.addWindowListener(new WindowAdapter() {
   public void windowClosing(WindowEvent we) {
    System.exit(0);
   }
  });
  jf.pack();
  jf.setVisible(true);
 }
 
}
