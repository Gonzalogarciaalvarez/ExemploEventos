/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploeventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ggarciaalvarez
 */
public class Evento implements ActionListener{
    JFrame marco;
    JPanel panel;
    JButton bAzul, bAmarillo, bRojo;
    //JTextField JtUsuario;
    //JPasswordField JtContrasinal;
    public Evento (){
        marco = new JFrame("Ventana eventos");
        panel = new JPanel();
        bAzul = new JButton("Azul");
        bRojo = new JButton("Rojo");
        bAmarillo = new JButton("Amarillo");
        
        marco.setSize(400,200);
        panel.add(bAzul);
        panel.add(bAmarillo);
        panel.add(bRojo);
        marco.add(panel);
        bAzul.addActionListener(this);
        bRojo.addActionListener(this);
        bAmarillo.addActionListener(this);
        //JtContrasinal = new JPasswordField(4);
        //JtUsuario = new JTextField(5);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if (boton == bAzul)
        panel.setBackground(Color.BLUE);
        else if (boton ==bRojo)
            panel.setBackground(Color.RED);
        else if (boton==bAmarillo)
            panel.setBackground(Color.YELLOW);
    }
    
}
