    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel ;
import javax.swing.JLabel ;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSlider;
/**
 *
 * @author crist
 */
public class Tablero extends JFrame{
   public static JButton [][]Matriz;
public JButton bPrueba;
public JPanel Panel ;
public Tamano venta;
public JSlider deslizar;



public Tablero(){
venta = new Tamano ();
add(getjPanel());
add(getbPrueba());
add(getJSlider());
inicializadorInterfaz();
}
public void inicializadorInterfaz(){

setLayout(null);
setSize(500,600);
setVisible(true);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public JButton getbPrueba(){

bPrueba = new JButton("Star");
bPrueba.setBounds(15,460,100,50);
bPrueba.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
      
        }

    });

return bPrueba;
}



public JPanel getjPanel(){

int filas =venta.ingresarFilas();
int columnas = filas;
JButton Matriz [][] = new Boton[filas][columnas]; 
JPanel Panel= new JPanel();
Panel.setLayout(new GridLayout(filas,columnas));

for (int i=0; i< filas;i++) { 
for (int j=0; j<columnas;j++) { 
Matriz[i][j] = new Boton() {}; 
Matriz[i][j].setBounds(20,10,500,500);

Panel.setBounds(100,100,270,300);
Panel.add(Matriz[i][j]); 
}
}

return Panel;
}
public void actionPerformed(ActionEvent e) {
    JButton botonPulsado = (JButton) e.getSource();
    botonPulsado.setBackground(Color.black);
    botonPulsado.setEnabled(false);
    
}
public JSlider getJSlider(){
        deslizar = new JSlider();
        deslizar.setBounds(130, 460, 200, 20);
        return deslizar;
    }
}
