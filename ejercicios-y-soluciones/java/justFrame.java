import java.awt.*;
public class justFrame extends java.applet.Applet {
  Frame window;
  public static void main(String args[]) {
    justFrame mio = new justFrame();
    mio.init();
    mio.start();
  }
  public void init() {
    window = new MyFrameO("Mi ventana");
    window.setSize(400,500);
    window.setVisible(true);
  }
}
class MyFrameO extends Frame {
  Label l;
  MyFrameO(String title) {
    super(title);
    setLayout(new GridLayout(1,1));
    l = new Label("Esto es una ventana de prueba hecha en java", Label.CENTER);
    add(l);
  }
}
