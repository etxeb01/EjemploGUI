/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class EjemploGui {

    public EjemploGui(){
        
        JFrame frame = new JFrame("Ventana");
        JPanel panel = (JPanel) frame.getContentPane();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel("Etiqueta Azul");
        JButton boton = new JButton("Boton");
        
        panel.add(panel2);
        panel2.add(label);
        panel2.add(boton);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                EjemploGui gui = new EjemploGui();
            }
        });
        
    }
    
}
