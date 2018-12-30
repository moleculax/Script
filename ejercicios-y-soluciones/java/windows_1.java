import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class windows_1 //extends JFrame
{

    public static void main(String []args)
    {
        new windows();
		
        JFrame jFrameWindow = new JFrame();
	final JLabel label = new JLabel("HOLA MUNDO DESDE JAVA \n En una Ventanita");
	jFrameWindow.getContentPane().add(label);
	jFrameWindow.pack();

	//dimenciones de la ventana

        jFrameWindow.setSize(640,480); 

	//titulo de la ventana

        jFrameWindow.setTitle("ESTA ES UNA VENTANA DE PRUEBA EN JAVA"); 
	
        jFrameWindow.setVisible(true);
	
	
	//System.exit(0);
    }
	
}


