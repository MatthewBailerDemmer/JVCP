package chapter14;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CriptoGrafiaBasica extends JFrame implements ActionListener {

    BorderLayout layout;

    JLabel titulo = new JLabel("Criptografia Basica");

    JTextArea textArea = new JTextArea();
    JButton botao = new JButton("Criptografar");

    JScrollPane s;

    public CriptoGrafiaBasica(){
        super("Criptografia Basica");
        layout = new BorderLayout(5,5);
        setLayout(layout);

        botao.addActionListener(this);


        textArea.setLineWrap(true);
        s = new JScrollPane(textArea);
        add(titulo, BorderLayout.NORTH);
        add(s, BorderLayout.CENTER);
        add(botao, BorderLayout.SOUTH);

    }

    public void actionPerformed(ActionEvent event){
        textArea.setText(criptografando(textArea.getText()));
    }

    public String criptografando(String e){
        char[] c = new char[e.length()];
        e.getChars(0, e.length(),c , 0);
        String s = "";
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] alfabetoM = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for(int i = 0; i < c.length; i++){
            for(int spec = 0; spec < alfabeto.length; spec ++){
                    if(c[i] == alfabeto[spec]){
                        if(spec == alfabeto.length -1){
                            c[i] = alfabeto[0];
                            break;
                        }else{
                            c[i] = alfabeto[spec + 1];
                            break;
                        }

                }
            }

            for(int spec = 0; spec < alfabetoM.length; spec ++){
                if(c[i] == alfabetoM[spec]){
                    if(spec == alfabetoM.length -1){
                        c[i] = alfabetoM[0];
                        break;
                    }else{
                        c[i] = alfabetoM[spec + 1];
                        break;
                    }

                }
            }
            s += c[i];
        }

        return s;
    };




}
