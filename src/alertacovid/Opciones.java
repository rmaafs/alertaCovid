/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alertacovid;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author zerme
 */
public class Opciones {
    public static JFrame frame;
    private JPanel panel;
    private  JLabel mensaje;
    private JButton b1, b2, b3;
    private int opc=2;
    
    Opciones(){
        frame = new JFrame ("Bienvenido");
        frame.setSize(650, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);
        
        b1 = new JButton("Alerta");
        b1.setBounds(278, 138, 95, 50);
        b2 = new JButton("Estado");
        b2.setBounds(278, 276, 95, 50);
        b3 = new JButton("Visita");
        b3.setBounds(278,414,95,50);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        
        
        //b3.addActionListener(MostrarEstado());
        b2.addActionListener(new ActionListener() { 
            @Override public void actionPerformed(ActionEvent e) { 
                //opc = 2;
                JFrame estado = new JFrame("Estado");
                estado.setBounds(150, 150, 300, 200);
                //estado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mensaje = new JLabel();
                Font font = new Font("Agency FB", Font.BOLD, 48);
                mensaje.setFont(font);
                //mensaje.setBounds(90, 10, 295, 100);
                JPanel panelE = new JPanel();
                //panelE.setBackground(Color.RED);
                switch(opc){
                    case 0:
                        panelE.remove(mensaje);
                        panelE.setBackground(Color.GREEN);
                        mensaje.setText("    Limpio    ");
                        mensaje.setBounds(90, 10, 295, 100);
                        panelE.add(mensaje);
                        break;
                    case 1:
                        panelE.remove(mensaje);
                        panelE.setBackground(Color.YELLOW);
                        mensaje.setText("En Contacto");
                        mensaje.setBounds(90, 10, 295, 100);
                        panelE.add(mensaje);
                        break;
                    case 2:
                        panelE.remove(mensaje);
                        panelE.setBackground(Color.RED);
                        mensaje.setText("Contagiado");
                        mensaje.setBounds(90, 10, 295, 100);
                        panelE.add(mensaje);
                        break;
                }
                //panelE.add(mensaje);
                JButton regreso = new JButton("Regresar a limpio");
                regreso.setBounds(80,100 , 60, 80);
                panelE.add(regreso);
                estado.add(panelE);
                estado.setResizable(false);
                estado.setVisible(true);
                
                regreso.addActionListener(new ActionListener(){
                    @Override public void actionPerformed(ActionEvent a){
                        opc=0;
                        panelE.setBackground(Color.GREEN);
                        panelE.remove(mensaje);
                        panelE.remove(regreso);
                        mensaje.setText("Limpio");
                        //mensaje.setBounds(90, 10, 295, 100);
                        //regreso.setBounds(80,100 , 60, 80);
                        panelE.add(mensaje);
                        panelE.add(regreso);
                        
                        
                    }
                });
            } 
        }); 
        
        
        frame.setVisible(true);
    }
    void MostrarEstado(){
        
    }
    
}
