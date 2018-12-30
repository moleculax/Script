import javax.swing.*;
 
public class agrafica extends JFrame{
 
    public agrafica(){
 
        //Añade un titulo, no es estrictamente necesario
        setTitle("Titulo de la ventana");
 
        /*
         * Coordenadas x y de la aplicacion y su altura y longitud,
         * si no lo indicamos aparecera una ventana muy pequeña
         */
        setBounds(400, 200, 250, 300);
 
        /*
         * Indica que cuando se cierre la ventana se acaba la aplicacion,
         * si no lo indicamos cuando cerremos la ventana la aplicacion seguira funcionando
         */
        setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        //Hace visible la ventana, si no lo hacemos no veremos la aplicacion
        setVisible(true);
 
    }
}
