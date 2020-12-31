/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alertacovid;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author francisco
 */
public class MenuPrincipal {
    private JFrame frame;
    private JPanel panel;
    private  JLabel label;
    
    MenuPrincipal(){
        frame = new JFrame("Cliente Linux");
        frame.setSize(850, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        
        frame.add(panel);
        frame.setVisible(true);
        
        label = new JLabel("Hola");
        panel.add(label);
        label.setBounds(150, 150, 550, 350);
        //label.setIcon(new ImageIcon("portada.png"));
    }
}
