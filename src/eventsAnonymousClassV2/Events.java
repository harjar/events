/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventsAnonymousClassV2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jarhar
 */
public class Events extends Frame {

    TextField textField;

    Events() {
        this.setSize(500, 200);

        textField = new TextField();

        textField.setBounds(60, 50, 180, 25);
        Button button = new Button("click Here");
        button.setBounds(100, 120, 80, 30);

        // Skapar och kopplar en anonym händselyssnare till komponenten.
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                skrivText();
            }
        });

        add(textField);
        add(button);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Events();
    }
    
    private void skrivText(){
        textField.setText("Anonymous");
    }
}
