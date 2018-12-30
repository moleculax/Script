// Anunciamos que usaremos la biblioteca de widgets de la AWT
import java.awt.*;
import java.awt.event.*;

public class GuiEv extends Frame { // Se especializa la ventana
  Button boton;  // Se crean variables de instancia
  Label etiq;    // para cada widget
  TextArea area;
  TextField texto;
  Checkbox check;
  List lista;
  Canvas canvas;

  Panel panel;   // El contenedor adicional para texto, boton y check

  public GuiEv() { // El constructor para la ventana
    setLayout(new BorderLayout()); // asigna el layout

    // crea los widgets
    boton= new Button("quit"); 
    etiq= new Label("¡Hello World!", Label.CENTER);
    area= new TextArea(5, 20);
    texto= new TextField(15);
    check= new Checkbox("check");

    lista = new List(4);
    for (int i = 1; i <= 4; i++) {
      lista.addItem("Ser o no Ser " + i);
    }

    canvas= new MiCanvas();

    panel= new Panel(); // El contenedor adicional
    panel.setLayout(new FlowLayout());

    // armamos el panel
    
    panel.add(texto);
    panel.add(boton);
    panel.add(check);

    // armamos la ventana

    add("North", etiq);
    add("West", area);
    add("East", lista);
    add("Center", canvas);
    add("South", panel);

    // Inscripcion para la acción que produce el campo de texto
    texto.addActionListener(new IngresoDeTexto());
  }

  public static void main(String[] args) { // El main
    Frame frame= new GuiEv(); // Crea la ventana,
    frame.pack();           // la despliega
    frame.show();           // y termina
  }

  public class IngresoDeTexto implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      lista.add(texto.getText()); // Agrega el ítem a la lista
      texto.setText(""); // Borra el campo de texto 
} } } 

// La extension de Canvas
class MiCanvas extends Canvas {
  public void paint(Graphics g) {
    int w = getSize().width;
    int h = getSize().height;
    g.drawLine(10,10, 100,100);
  }

  public Dimension getMinimumSize() {
    return new Dimension(150,130);
  }

  public Dimension getPreferredSize() {
    return getMinimumSize();
  }
}
