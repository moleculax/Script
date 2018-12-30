import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Edit extends JFrame {
	//Para explorar directorios para abrir y guardar archivos
	JFileChooser fileChooser = null;
	//Para escribir texto
	JEditorPane editPane;
	//Scroll del lado derecho
	JScrollPane scrollPaneRight;
	//Scroll del lado izquierdo
	JScrollPane scrollPaneLeft;
	//Panel izquierdo donde va la lista de archivo abiertos
	JPanel leftPanel;
	//La barra del Menu
	JMenuBar menuBar;
	//El menu
	JMenu fileMenu;
	//Los items del menu
	JMenuItem newMenu;
	JMenuItem openMenu;
	JMenuItem saveMenu;
	JMenuItem exitMenu;
	//Contenedor con division izquierda derecha
	JSplitPane splitPane;
	//El panel del estado y sus mensajes
	JPanel statusPanel;
	JLabel statusMsg1;
	JLabel statusMsg2;
	//Tool bar
	JToolBar toolBar;
	//Todos los botones
	JButton openButton;
	JButton saveButton;
	JButton cutButton;
	JButton pasteButton;
	JButton copyButton;
	JButton openSelectedButton;
	//La lista que se despliega en el lado izquierdo
	JList list;
	//Vector para almacenar los archivos abiertos
	Vector fileVector = new Vector();
	String fileName;
	boolean isSaved = false;

	//Clase interna para manejar los eventos
	class EventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Si se elige salir en el menu
			if (e.getSource() == exitMenu)
			{
				//Si el archivo abierto no esta en blanco y no esta guardado 
				if (!isSaved && !editPane.getText().equals(""))
					askSave();
				System.exit(0);
			}
			//Si se elige abrir un archivo en el menu o con el boton de abrir en el toolbar
			if (e.getSource() == openMenu || e.getSource() == openButton)
			{
				//misma verificacion anterior
				if (!isSaved && !editPane.getText().equals(""))
					askSave();
				openFile();
			}
			//Si se elige en el menu editar un archivo en blanco
			if (e.getSource() == newMenu)
			{
				//idem
				if (!isSaved && !editPane.getText().equals(""))
					askSave();
				newFile();
			}
			//Si se elige guardar en el menu o en el toolbar
			if (e.getSource() == saveMenu || e.getSource() == saveButton)
				saveFile();
			if (e.getSource() == copyButton)
				editPane.copy();
			if (e.getSource() == cutButton)
				editPane.cut();
			if (e.getSource() == pasteButton)
				editPane.paste();
			//Si se elige el boton abrir la lista del lado izquierdo
			if (e.getSource() == openSelectedButton)
				openSelectedFile();
		};
	};
	ActionListener eventHandler = new EventHandler();
public Edit(String title) 
{
	super(title);
}
//Agrega un archivo a la lista de la izquierda
public void agregaLista(String file)
{
	if (fileVector.contains(file))
		return;
	fileVector.add(file);
	Collections.sort(fileVector);
	list.setListData(fileVector);
}
//Dialogo que verifica si el usuario desea guardar el archivo
public void askSave() 
{
	//Componente que muestra ventanas de opciones
	JOptionPane optionPane=new JOptionPane();
	Object[] opciones={"Si","No"};
	//Dialogo modal SI_NO
	int ret=optionPane.showOptionDialog(this,"Desea guardar? ","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
	//Si la opcion escogida es Si
	if(ret==JOptionPane.YES_OPTION)
		saveFile();
	}
//Suscribe los objetos al manejador de eventos eventHandler
public void initConnections()
{

	newMenu.addActionListener(eventHandler);
	openMenu.addActionListener(eventHandler);
	saveMenu.addActionListener(eventHandler);
	exitMenu.addActionListener(eventHandler);
	openButton.addActionListener(eventHandler);
	saveButton.addActionListener(eventHandler);
	copyButton.addActionListener(eventHandler);
	cutButton.addActionListener(eventHandler);
	pasteButton.addActionListener(eventHandler);
	openSelectedButton.addActionListener(eventHandler);
	

}
//Inicializa las componentes de la aplicacion
public void initialize()
{
	//Define que el Layout del contenedor sea de tipo BorderLayout
	this.getContentPane().setLayout(new BorderLayout());

	// Clase anonima para que la aplicacion se cierre al apretar la X (boton esquina superior derecha)
	this.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
			if (!isSaved && !editPane.getText().equals(""))
				askSave();
			System.exit(0);
		}
	});

	/*****JMenuBar*****/
	menuBar = new JMenuBar();
	fileMenu = new JMenu("Archivo");
	newMenu = new JMenuItem("Nuevo");
	openMenu = new JMenuItem("Abrir");
	saveMenu = new JMenuItem("Guardar");
	exitMenu = new JMenuItem("Salir");
	//Agrega los items al menu
	fileMenu.add(newMenu);
	fileMenu.add(openMenu);
	fileMenu.add(saveMenu);
	fileMenu.addSeparator();
	fileMenu.add(exitMenu);
	//Agrega el menu a la barra de menu
	menuBar.add(fileMenu);
	//Setea esa bara de menu para el frame
	this.setJMenuBar(menuBar);

	
	/*****JToolBar*****/
	toolBar = new JToolBar();
	openButton = new JButton();
	openButton.setIcon(new ImageIcon(getClass().getResource("/open.gif")));
	openButton.setMargin(new Insets(0, 0, 0, 0));
	toolBar.add(openButton);
	
	saveButton = new JButton();
	saveButton.setIcon(new ImageIcon(getClass().getResource("/save.gif")));
	saveButton.setMargin(new Insets(0, 0, 0, 0));
	toolBar.add(saveButton);
	
	toolBar.addSeparator();
	
	copyButton = new JButton();
	copyButton.setIcon(new ImageIcon(getClass().getResource("/copy.gif")));
	copyButton.setMargin(new Insets(0, 0, 0, 0));
	toolBar.add(copyButton);
	
	cutButton = new javax.swing.JButton();
	cutButton.setIcon(new ImageIcon(getClass().getResource("/cut.gif")));
	cutButton.setMargin(new Insets(0, 0, 0, 0));
	toolBar.add(cutButton);
	
	pasteButton = new javax.swing.JButton();
	pasteButton.setIcon(new ImageIcon(getClass().getResource("/paste.gif")));
	pasteButton.setMargin(new Insets(0, 0, 0, 0));
	toolBar.add(pasteButton);
	//Agrega el toolbar en el norte del contenedor
	this.getContentPane().add(toolBar, BorderLayout.NORTH);

	/*****Status bar*****/
	statusPanel = new JPanel();
	statusPanel.setLayout(new BorderLayout());
	statusMsg1 = new JLabel("Estado: ");
	statusMsg2 = new JLabel();
	statusPanel.add(statusMsg1, BorderLayout.WEST);
	statusPanel.add(statusMsg2, BorderLayout.CENTER);
	//Agrega el panel de satus al sur del contenedor
	this.getContentPane().add(statusPanel, BorderLayout.SOUTH);

	/*****Text Editor*****/
	editPane = new JEditorPane();
	editPane.setText("");
	scrollPaneRight = new JScrollPane(editPane);

	/*****List*****/
	list=new JList();
	scrollPaneLeft=new JScrollPane(list);
	openSelectedButton=new JButton("Abrir");

	/*****leftPanel*****/
	leftPanel=new JPanel(new BorderLayout());
	leftPanel.add(scrollPaneLeft,BorderLayout.CENTER);
	leftPanel.add(openSelectedButton,BorderLayout.SOUTH);


	/*****Split Panel*****/
	//Define un contenedor con division izq-der
	splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	splitPane.setRightComponent(scrollPaneRight);
	splitPane.setLeftComponent(leftPanel);
	this.getContentPane().add(splitPane, BorderLayout.CENTER);

}
public static void main(java.lang.String[] args)
{
	Edit aplication = new Edit("Editor simple");
	aplication.initialize();
	aplication.initConnections();
	aplication.pack();
	aplication.setSize(500, 400);
	aplication.setLocation(100, 100);
	aplication.setVisible(true);
}
//Para abrir un nuevo archivo en blanco
public void newFile()
{
	editPane.setText("");
	isSaved=false;

}
//Para abrir un achivo existente
public void openFile()
{
	//Si no existe el file chooser, crea uno
	if (fileChooser == null)
	{
		fileChooser = new JFileChooser();
	}
	//Valor que retorna al elegir una opcion en el file chooser
	int retVal = fileChooser.showOpenDialog(this);
	//Si se escogio Ok, (o abrir)
	if (retVal == fileChooser.APPROVE_OPTION)
	{
		//El path absoluto del archivo elegido
		fileName = fileChooser.getSelectedFile().getAbsolutePath();
		try
		{
			//Pasa el nombre del archivo a URL
			java.net.URL url = fileChooser.getSelectedFile().toURL();
			statusMsg2.setText("abriendo " + fileName);
			//Abre el archivo elegido en el panel de texto
			editPane.setPage(url);
			isSaved = false;
			//Se agrega el archivo abierto a la lista de la izquierda
			agregaLista("" + fileName);
		}
		catch (Exception ioe)
		{
			statusMsg2.setText(ioe.getMessage());
		}
	}
}
//Abre el archivo seleccionado en la lista de la izquierda
public void openSelectedFile()
{
	if(list.getSelectedIndex()==-1)
		return;
	int ndx=list.getSelectedIndex();
	try
	{
		String name=(String)fileVector.get(ndx);
		java.net.URL url=(new java.io.File(name)).toURL();
		editPane.setPage(url);
	}
	catch(Exception e)
	{
		statusMsg2.setText(e.getMessage());
	}
}
//Guarda el archivo que esta en el panel de texto
public void saveFile()
{
	//Utiliza un file chooser para explorar donde guardarlo
	//Si no existe, crea uno
	if (fileChooser == null)
	{
		fileChooser = new JFileChooser();
	}
	int retVal = fileChooser.showSaveDialog(this);
	if (retVal == fileChooser.APPROVE_OPTION)
	{
		fileName = fileChooser.getSelectedFile().getAbsolutePath();
		try
		{
	 		statusMsg2.setText("Guardando "+fileName);
	 		//Toma el texto que hay en el panel de texto
			String text=editPane.getText();
			java.io.FileWriter fileWriter=new java.io.FileWriter(fileName);
			java.io.BufferedWriter br = new java.io.BufferedWriter(fileWriter);
			br.write(text);
			br.close();
			isSaved=true;
			//Agrega el archivo a la lista de la izquierda
			agregaLista(""+fileName);
			
		}
		catch (Exception ioe)
		{
			statusMsg2.setText(ioe.getMessage());
		}
	}

}
}
