package Calculadora;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {

     int janelaAL = 540;

     int janelaLA = 360;

     JButton botao1 = null;

     JFrame frame = new JFrame("Calculadora");

     JLabel tituloLabel = new JLabel();
     JPanel tituloPainel = new JPanel();


     Color customMusg = new Color(9, 23, 8);
     Color customWhiteParchment = new Color(43, 247, 232);
     Color customVine = new Color(160, 64, 87);
     Color customPalidBlue = new Color(82, 168, 199);

     protected Interface(){

         frame.setVisible(true);
         frame.setSize(janelaLA, janelaAL);
         frame.setLocationRelativeTo(null);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(new BorderLayout());

         tituloLabel.setBackground(customMusg);
         tituloLabel.setForeground(Color.white);
         tituloLabel.setFont(new Font("Arial", Font.PLAIN, 80));
         tituloLabel.setHorizontalAlignment(JLabel.RIGHT);
         tituloLabel.setText("0");
         tituloLabel.setOpaque(true);

         tituloPainel.setLayout(new BorderLayout());
         tituloPainel.add(tituloLabel);
         frame.add(tituloPainel);

     }

}


