/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import javax.swing.*;

/**
 *
 * @author cristian
 */
public class Juego extends JFrame{
    private JButton boton;
    private JSlider deslizar;
    private JButton[][] matriz;
    
    public Juego(){
    super("Juego de la Vida");
    this.setBounds(100, 100, 600, 420);
    this.setLayout(null);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    
    }
}
