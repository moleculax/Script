import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

class CapturarPantalla {
  public static void main(String args[])
        throws AWTException, IOException {
     // captura la pantalla completa
     BufferedImage pantalla = new Robot().createScreenCapture(
     new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) );
     // Lo guarda como un JPEG
     File file = new File("pantalla.jpg");
     ImageIO.write(pantalla, "jpg", file);
   }
}

