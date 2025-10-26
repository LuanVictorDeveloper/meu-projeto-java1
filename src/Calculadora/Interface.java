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

     JFrame frame = new JFrame("Calculadora");

     JLabel tituloLabel = new JLabel();
     JPanel tituloPainel = new JPanel();
     JPanel tituloBotoesPanel = new JPanel();

     String[] botoesValores = {
             "AC","+/-","%","÷",
             "7","8","9", "×",
             "4","5","6", "+",
             "3","2","1", "-",
             "0",".","√", "="
     };
    String[] operadoresBase = {"÷", "×", "-", "+", "="};
    String[] operadoresExtra = {"AC", "+/-", "%"};


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

         tituloLabel.setBackground(Color.black);
         tituloLabel.setForeground(Color.white);
         tituloLabel.setFont(new Font("Arial", Font.PLAIN, 80));
         tituloLabel.setHorizontalAlignment(JLabel.RIGHT);
         tituloLabel.setText("0");
         tituloLabel.setOpaque(true);

         tituloPainel.setLayout(new BorderLayout());
         tituloPainel.add(tituloLabel);
         frame.add(tituloPainel, BorderLayout.NORTH);

         tituloBotoesPanel.setLayout(new GridLayout(5,4));
         tituloBotoesPanel.setBackground(customVine);
         frame.add(tituloBotoesPanel);

         for (int i = 0 ; i < botoesValores.length ; i++ ) {

             JButton botoes = new JButton(botoesValores[i]);
             String botoesValor = botoesValores[i];
             botoes.setFont(new Font("Arial", Font.PLAIN,30));
             botoes.setText(botoesValor);
             botoes.setFocusable(false);
             botoes.setBorder(new LineBorder(customVine));

             if (Arrays.asList(operadoresBase).contains(botoesValor)) {

                 botoes.setBackground(customWhiteParchment);
                 botoes.setForeground(customMusg);

             }
             else if(Arrays.asList(operadoresExtra).contains(botoesValor)){
                 botoes.setBackground(customVine);
                 botoes.setForeground(Color.white);

             }
             else{

                 botoes.setBackground(customPalidBlue);
                 botoes.setForeground(Color.white);

             }

             tituloBotoesPanel.add(botoes);

             botoes.addActionListener(new ActionListener() {

                 public void actionPerformed(ActionEvent e) {

                     JButton botoes = (JButton) e.getSource();

                     String botoesValor = botoes.getText();

                     if(Arrays.asList(operadoresBase).contains(botoesValor)){

                     }
                     else if(Arrays.asList(operadoresExtra).contains(botoesValor)){

                     }
                     else{

                         if(botoesValor == "."){

                             if(!tituloLabel.getText().contains(botoesValor)) {

                                 tituloLabel.setText(tituloLabel.getText() + botoesValor);

                             }

                         }
                         else if("0123456789".contains(botoesValor)){

                             if(tituloLabel.getText() == "0"){

                                 tituloLabel.setText(botoesValor);
                             }
                             else{

                                 tituloLabel.setText(tituloLabel.getText() + botoesValor);

                             }
                         }
                     }

                 }

             });
         }


     }

}


