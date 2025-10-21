/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventsInMainClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jarhar
 */
public class Events extends Frame implements ActionListener{
  TextField textField;

    Events()
    {
        this.setSize(500, 200);

        textField = new TextField();

        textField.setBounds(60, 50, 180, 25);
        Button button = new Button("click Here");
        button.setBounds(100, 120, 80, 30);

        // Kopplar lyssnare till en komponent.
        // Skicka sig sjäv som lyssnare.
        button.addActionListener(this);

        add(textField);
        add(button);

        // set visibility
        setVisible(true);
    }
  
    // implementing method of actionListener
    public void actionPerformed(ActionEvent e)
    {
        // Setting text to field
        textField.setText("GFG!");
    }
  
    public static void main(String[] args)
    {
      new Events(); 
    }    
}
