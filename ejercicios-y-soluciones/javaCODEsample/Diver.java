/*
* Copyright 2003 Sun Microsystems, Inc. ALL RIGHTS RESERVED 
* Use of this software is authorized pursuant to the terms 
* of the license found at 
* http://developer.java.sun.com/berkeley_license.html. 
*/

package divelog;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Color.*;



public class Diver extends JPanel implements ActionListener
{ // Opens class

           
     // Fields for Diver Personal Information
     
     // Text fields for user input
     private JTextField name; 
     private JTextField street; 
     private JTextField city; 
     private JTextField statezip;  
             
     // Labels to go with each text field
     private JLabel lname;
     private JLabel lstreet;
     private JLabel lcity;
     private JLabel lstatezip;          
            
     // Check boxes for types of diver training
     private JCheckBox ow;
     private JCheckBox a;
     private JCheckBox res;
     private JCheckBox un;
     private JCheckBox w;
             
     // Textfields for Emergency box
     private JTextField nname;
     private JTextField phone;
     private JTextField rel;
     
     // Textfields for Emergency Contact
     private JLabel lnname;
     private JLabel lphone;
     private JLabel lrel;
     
     // Buttons and image
     private JButton enter; 
     private JButton edit; 
     private JLabel seahorse; 
             
     // Panels to be built and added
     // to the border layout of this
     // panel.
             
     private JPanel images;
     private JPanel jaddress;
     private JPanel emerg;
     private JPanel training;
             
     // Class to handle functionality of checkboxes  
     ItemListener handler = new CheckBoxHandler();
              
                         
     // Class constructor that builds the necessary
     // labels and text fields images, buttons,
     // and panels.         
         
          public Diver()
            { // Opens Constructor
             // Sets layout for Diver panel
             setLayout(new BorderLayout());
             // Sets background color for
             // Diver panel
             setBackground(Color.white);
             
             // Initializes textfields
             name = new JTextField("Enter Your Name");
             street = new JTextField();
             city = new JTextField ();
             statezip = new JTextField ();
             // Initializes labels for textfields
             lname = new JLabel("Name: ");
             lstreet = new JLabel("Street: ");
             lcity = new JLabel ("City: ");
             lstatezip = new JLabel("State & Zip Code: ");
             // Initializes checkboxes with titles
             ow = new JCheckBox("Open Water", true);
             a = new JCheckBox("Advanced");
             res = new JCheckBox("Recovery & Rescue");
             un = new JCheckBox("Underwater Photography");
             w = new JCheckBox("Wreck & Cave Diving");
             
             // Initializes textfields for emergency panel
             nname = new JTextField();
             phone = new JTextField();
             rel = new JTextField ();
             // Initializes labels for textfields
             lnname = new JLabel("Name: ");
             lphone = new JLabel("Phone: ");
             lrel = new JLabel ("Relationship: ");
             // Initialize objects
             enter = new JButton("Enter Diver Data");
             edit = new JButton("Edit Diver Data");
             seahorse = new JLabel("",  
                  new ImageIcon("images/2seahorses.jpg"), 
                                          JLabel.CENTER);
             // Calls method to buid image panel, which 
             // is defined outside of the constructor
             buildImagePanel();     
             
             // Calls method to buid address panel, which 
             // is defined outside of the constructor         
             buildAddressPanel();
             
             // Calls method to buid emerg panel, which 
             // is defined outside of the constructor
             buildEmergencyPanel();
             
             // Calls method to buid training panel, which 
             // is defined outside of the constructor
             buildTrainingPanel();
             
           //The methods called above build the panels, then this
          // call to add adds each panel to the main panel's
          // border layout manager.
     
           add(jaddress, BorderLayout.NORTH);
           add(images, BorderLayout.CENTER);
           add(training, BorderLayout.EAST);
           add(emerg, BorderLayout.SOUTH);
        
       
        } // Ends constructor
        
        
        // This method creates a panel called images
        private void buildImagePanel()
        { // Opens method
           images = new JPanel();
          // Sets the color, layout, and adds the
          // seahorse object
           images.setBackground(Color.white);
           images.setLayout(new FlowLayout() );
           images.add(seahorse);
          } // Closes method
        
        private void buildAddressPanel ()
        { // Opens method
          jaddress = new JPanel();
          // Sets color and layout.
          // Adds the textfields and labels for
          // diver input.
          jaddress.setBackground(Color.white);
          jaddress.setLayout( new  GridLayout(2, 4, 20, 20) );
          //Adds each component to the panel
          jaddress.add(lname); 
          jaddress.add(name); 
          jaddress.add(lstreet);
          jaddress.add(street);
          jaddress.add(lcity);  
          jaddress.add(city);  
          jaddress.add(lstatezip);  
          jaddress.add(statezip);
  
          // Sets a border around the panel, including
          // a title
          jaddress.setBorder(BorderFactory.createTitledBorder(
                                    "Diver Personal Information"));
             
          //Listeners for each text field in the 
          name.addActionListener( this );
          street.addActionListener( this );
          city.addActionListener( this );
          statezip.addActionListener( this );
           
        } // Closes method
        
        private void buildEmergencyPanel()
         { // Opens method
          //Create another panel for emergency input fields
            emerg = new JPanel();
            emerg.setLayout( new  GridLayout(2, 4, 20, 0) );
            emerg.setBackground(Color.white);
          
            emerg.add( lnname); 
            emerg.add( nname); 
            emerg.add( lphone);
            emerg.add( phone);
            emerg.add( lrel);  
            emerg.add( rel);
            emerg.add(enter);
            emerg.add(edit);
           //Creates titled border around emerg panel
            emerg.setBorder(BorderFactory.createTitledBorder("Emergency"));

            //Adds an actionListener for Emergency Info
            nname.addActionListener( this );
            phone.addActionListener( this );
            rel.addActionListener( this );
           
            
            //Creates borders around the Edit and 
            // Enter Diver Data buttons
            enter.setBorder(BorderFactory.createRaisedBevelBorder());
            edit.setBorder(BorderFactory.createRaisedBevelBorder());
      
             //Listeners for the buttons
             enter.addActionListener( this );
             edit.addActionListener( this );
            } //Closes method
        
        private void buildTrainingPanel()
        { //Opens method
        
          // Creates a panel for training courses
     
           training = new JPanel();
           training.setBackground(Color.white);
           training.setLayout(new GridLayout(5, 1, 10, 20 ) );
           //sets backgrounds of components to white
           training.add(ow).setBackground(Color.white);
           training.add(a).setBackground(Color.white);
           training.add(un).setBackground(Color.white);
           training.add(res).setBackground(Color.white);
           training.add(w).setBackground(Color.white);
        
          //Sets a titled border around training panel
          training.setBorder(BorderFactory.createTitledBorder("Training"));
          //Adds listeners to checkbox items
            ow.addItemListener(handler);
            a.addItemListener(handler);
            un.addItemListener(handler);
            res.addItemListener(handler);
            w.addItemListener(handler);
         } //Closes method
     
      // Prints the input into JLabels and hides text fields, or
      // returns the text fields so input may be changed 
   
      public void actionPerformed(ActionEvent evt) 
        { // Opens method
        // Checks if the button clicked was the 
        // Enter Diver Data button.
        // If not, moves on to next if statment.
        // Otherwise it enters this if statement
        if ((evt.getSource() == name) || (evt.getSource() == enter))
             { // Opens if statement
              //Retrives the text from the name text field and 
              //assigns it to the variable nameText of
              //type String
              String nameText = name.getText();
              lname.setText("Name:    " + nameText);
              //After printing text to JLabel, hides the textfield
              name.setVisible(false);
              }// ends if statement
        if ((evt.getSource() == street) || (evt.getSource() == enter)) 
             { // Opens if statement                         
              String streetText = street.getText();
              lstreet.setText("Street:    " + streetText);
              street.setVisible(false);
               }// ends if statement   
         if ((evt.getSource() == city) || (evt.getSource() == enter))  
             { // Opens if statement           
              String cityText = city.getText();
              lcity.setText("City:  " + cityText);
              city.setVisible(false);
                   }// ends if statement         
         if ((evt.getSource() == statezip) || (evt.getSource() == enter))
             { // Opens if statement             
              String statezipText = statezip.getText();
              lstatezip.setText("State & Zip:     " + statezipText);
              statezip.setVisible(false);
                   }// ends if statement         
        if ((evt.getSource() == nname) || (evt.getSource() == enter)) 
             { // Opens if statement             
              String relname = nname.getText();
              lnname.setText("Name:   " + relname);
              nname.setVisible(false);
                    }// ends if statement        
        if ((evt.getSource() == phone) || (evt.getSource() == enter))
             { // Opens if statement              
              String relphone = phone.getText();
              lphone.setText("Phone:   " + relphone);
              lphone.setForeground(Color.red);
              phone.setVisible(false);
              }
        if ((evt.getSource() == rel) || (evt.getSource() == enter))  
        {            
              String relString = rel.getText();
              lrel.setText("Relationship:   " + relString);
              rel.setVisible(false);
   
 
          // If Edit button was clicked, set textfields to
          // visible for user to reenter information and
          // it sets the text that had been entered to
          // to an empty String, giving the appearance
          // that the text has been removed.   
          } // Closes if statement
           if (evt.getSource() == edit)
              { // Opens else if statement
        
           // If edit button has been pressed
           // the following is set to visible
            name.setVisible(true);
            street.setVisible(true);
            city.setVisible(true);
            statezip.setVisible(true);
            
            // Relative's info
            
            nname.setVisible(true);
            phone.setVisible(true);
            rel.setVisible(true);
            
            lnname.setText("Name:   ");
            lnname.setForeground(Color.black);
            lphone.setText("Phone:   ");
            lphone.setForeground(Color.black);
            lrel.setText("Relationship:   ");
            lrel.setForeground(Color.black);
        
         } // Ends if statement
        
        } // Ends actionPerformed method

 // Inner class that handles functionality for the
 // checkboxes.
 private class CheckBoxHandler implements ItemListener 
 { // Opens inner class
       
      public void itemStateChanged (ItemEvent e)
        { // Opens method
               // Retrieves object that fires an 
               // event, casts it as a JCheckBox
               // object and assigns it to source.
               JCheckBox source = (JCheckBox) e.getSource();
               // If the object is selected . . .
               if ( e.getStateChange() == ItemEvent.SELECTED )
                 // change the foreground to blue
                 source.setForeground(Color.blue);
                 // otherwise set the foreground to black.
               else
                 source.setForeground(Color.black);
              
             } // Closes ItemStateChanged method
      } // Closes class CheckBoxHandler
  

  } // Closes Class Diver
 
               
               
               
  
