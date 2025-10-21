/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventsOtherClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

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

        // Skapar objektet som fungerar som en lyssnare.
        Other other = new Other(this);

        // Kopplar lyssnare till en komponent.
        // Skicka referansen till lyssnare.
        button.addActionListener(other);

        add(textField);
        add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Events();
    }
}
