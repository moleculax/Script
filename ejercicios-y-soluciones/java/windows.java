import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class windows extends JFrame
{

    public static void main(String []args)
    {
        new windows();
		
        JFrame jFrameWindow = new JFrame();

	//dimenciones de la ventana

        jFrameWindow.setSize(1024,780); 

	//titulo de la ventana

        jFrameWindow.setTitle("ESTA ES UNA VENTANA  Swing"); 

        jFrameWindow.setVisible(true);
	
	
	//System.exit(0);
    }
	
}


