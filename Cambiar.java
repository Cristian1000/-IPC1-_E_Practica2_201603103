/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author crist
 */
public class Cambiar extends JButton implements ActionListener{
Tablero inter ;
Tamano venta;
public JSlider deslizar;
public Cambiar(){

inter = new Tablero();
//venta = new Ventana();


}

public void inicializarAcciones(){

for(int i=0; i<=venta.ingresarFilas(); i++) {
    for(int j = 0; j <=venta.ingresarFilas();j++){
inter.Matriz[i][j].addActionListener(this);
}
}
inter.bPrueba.addActionListener(this);
}
 
 public void actionPerformed(ActionEvent e) {
    JButton botonPulsado = (JButton) e.getSource();
    botonPulsado.setBackground(Color.black);
    botonPulsado.setEnabled(false);
    
}
    
}
