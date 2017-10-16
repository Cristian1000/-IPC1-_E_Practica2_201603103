/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author crist
 */
public class Tamano{
    public static int filas;
    
    public Tamano(){
    
    }
    public int ingresarFilas(){

filas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese tamaño de la matriz","Matriz cuadrada",JOptionPane.QUESTION_MESSAGE));

return filas;

}   

    
}
