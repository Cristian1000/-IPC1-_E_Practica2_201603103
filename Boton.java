/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author crist
 */
public  class Boton extends JButton implements ActionListener {
    
    public Boton( ){ 
        addActionListener(this);
    }
   
   
    public void actionPerformed( ActionEvent e){
    JButton botonPulsado = (JButton) e.getSource();
    botonPulsado.setBackground(Color.black);
    botonPulsado.setEnabled(false);
    }   
}
