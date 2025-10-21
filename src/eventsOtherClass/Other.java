/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventsOtherClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jarhar
 */
public class Other implements ActionListener {
     Events gfgObj;

    Other(Events gfgObj) { 
      this.gfgObj = gfgObj; 
    }

    public void actionPerformed(ActionEvent e)
    {
        // setting text from different class
        gfgObj.textField.setText("Using Different Classes");
    }
}
