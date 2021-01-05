/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alertacovid;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Oscar Mora
 */
public class Visita {
    private JFrame frame;
    private JPanel panel;
    private JButton boton1;
    private JTextField codigo_lugar ;
    private JLabel label1,label,label_fecha,label_fecha1,label_fecha2;
    
    Visita (){
        LocalDateTime ahora= LocalDateTime.now();
                int año = ahora.getYear();
                int mes = ahora.getMonthValue();
                int dia = ahora.getDayOfMonth();
                int hora = ahora.getHour();
                int minutos = ahora.getMinute();
                int segundos = ahora.getSecond();
        frame = new JFrame ("Visita");
        frame.setLayout(null);
        frame.setSize(350, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
       
        label=new JLabel("Registro de Visita");
        label.setBounds(50,10,100,30);
        
        label1=new JLabel("Codigo del lugar:");
        label1.setBounds(10,40,100,30);
        
        codigo_lugar= new JTextField (20);
        codigo_lugar.setBounds(120,40,150,30);
        codigo_lugar.setBackground(new Color(255, 255, 51));
        codigo_lugar.setForeground(new java.awt.Color(102, 102, 255));
        
        label_fecha=new JLabel("Fecha de ingreso");
        label_fecha.setBounds(10,100,100,30);
        String cadena=dia+"/"+mes+"/"+año+" a las ";
        label_fecha1=new JLabel(cadena);
        label_fecha1.setBounds(120,100,100,30);
        label_fecha2=new JLabel(hora+":"+minutos+":"+segundos);
        label_fecha2.setBounds(200,100,100,30);
        
        boton1=new JButton("Aceptar");
        boton1.setBounds(10,80,100,30);
        frame.add(boton1);
        boton1.addActionListener(new ActionListener(){
            @Override public void actionPerformed(ActionEvent e) { 
                String cad=codigo_lugar.getText();
                
                if("".equals(cad)||cad==null||" ".equals(cad)){
                    JOptionPane.showMessageDialog(null, "Ingresa el codigo por favor");
                }
                else{
                    LocalDateTime ahora= LocalDateTime.now();
                    int año1 = ahora.getYear();
                    int mes1 = ahora.getMonthValue();
                    int dia1 = ahora.getDayOfMonth();
                    int hora1 = ahora.getHour();
                    int minutos1 = ahora.getMinute();
                    int segundos1 = ahora.getSecond();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Visita.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "Visita Registrada Gracias");
                    frame.setVisible(false);
                    Opciones.frame.setVisible(true);
                }
        
            }

            
        
        });
        
        frame.add(panel);
        frame.add(label);
        frame.add(label1);
        frame.add(label_fecha);
        frame.add(label_fecha1);
        frame.add(label_fecha2);
        frame.add(codigo_lugar);
        
        frame.setVisible(true);
    }
    
}
