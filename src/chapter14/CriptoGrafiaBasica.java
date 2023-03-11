package chapter14;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CriptoGrafiaBasica extends JFrame implements ActionListener {

    BorderLayout layout;

    JLabel titulo = new JLabel("Criptografia Basica");
    JPanel southPanel = new JPanel();

    JTextArea textArea = new JTextArea();
    JTextArea textArea2 = new JTextArea();
    JButton botao = new JButton("Criptografar");
    JButton botao2 = new JButton("De-criptografar");

    JScrollPane s, s2;

    public CriptoGrafiaBasica(){
        super("Criptografia Basica");
        layout = new BorderLayout(50,50);
        setLayout(layout);
        botao.addActionListener(this);
        botao2.addActionListener(this);

        southPanel.setLayout(new FlowLayout());
        southPanel.add(botao);
        southPanel.add(botao2);



        textArea.setLineWrap(true);
        textArea.setSize(200,300);
        textArea2.setSize(200,300);

        s = new JScrollPane(textArea);
        textArea2.setLineWrap(true);
        s2 = new JScrollPane(textArea2);

        textArea2.setEditable(false);


        add(titulo, BorderLayout.NORTH);
        add(s, BorderLayout.WEST);
        add(s2, BorderLayout.EAST);
        add(southPanel, BorderLayout.SOUTH);


    }

    @Override
    public void actionPerformed(ActionEvent event){
        int oqFazer = 0;
        if(event.getSource().equals(botao))
           oqFazer = 1;
       else if(event.getSource().equals(botao2))
           oqFazer = 2;
       textArea2.setText(this.criptografando(textArea.getText(), oqFazer));
    }

    public String criptografando(String e, Integer z){
        char[] c = new char[e.length()];
        e.getChars(0, e.length(),c , 0);
        String s = "";
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] alfabetoM = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

       if(z == 1) {
           for (int i = 0; i < c.length; i++) {
               for (int spec = 0; spec < alfabeto.length; spec++) {
                   if (c[i] == alfabeto[spec]) {
                       if (spec == alfabeto.length - 1) {
                           c[i] = alfabeto[0];
                           break;
                       } else {
                           c[i] = alfabeto[spec + 1];
                           break;
                       }

                   }
               }

               for (int spec = 0; spec < alfabetoM.length; spec++) {
                   if (c[i] == alfabetoM[spec]) {
                       if (spec == alfabetoM.length - 1) {
                           c[i] = alfabetoM[0];
                           break;
                       } else {
                           c[i] = alfabetoM[spec + 1];
                           break;
                       }

                   }
               }
               s += c[i];
           }
       }else if(z == 2){
           for (int i = 0; i < c.length; i++) {
               for (int spec = 0; spec < alfabeto.length; spec++) {
                   if (c[i] == alfabeto[spec]) {
                       if (spec == 0) {
                           c[i] = alfabeto[alfabeto.length - 1];
                           break;
                       } else {
                           c[i] = alfabeto[spec - 1];
                           break;
                       }

                   }
               }

               for (int spec = 0; spec < alfabetoM.length; spec++) {
                   if (c[i] == alfabetoM[spec]) {
                       if (spec == 0) {
                           c[i] = alfabetoM[alfabetoM.length - 1];
                           break;
                       } else {
                           c[i] = alfabetoM[spec - 1];
                           break;
                       }

                   }
               }
               s += c[i];
           }
       }

        return s;
    };






}
