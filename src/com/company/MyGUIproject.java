package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MyGUIproject extends JFrame implements ActionListener {
    private JButton carpma;
    private JPanel rootPanel;
    private JButton cikarma;
    private JButton toplama;
    private JButton bolme;
    private JTextField sonucEkrani;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton cButton;
    private JButton sonuc;


    public MyGUIproject() {


        //This uses the form designer form
        add(rootPanel);

        setTitle("Hesap Makinesi");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        a0Button.addActionListener(this);
        a1Button.addActionListener(this);
        a2Button.addActionListener(this);
        a3Button.addActionListener(this);
        a4Button.addActionListener(this);
        a5Button.addActionListener(this);
        a6Button.addActionListener(this);
        a7Button.addActionListener(this);
        a8Button.addActionListener(this);
        a9Button.addActionListener(this);
        toplama.addActionListener(this);
        cikarma.addActionListener(this);
        carpma.addActionListener(this);
        bolme.addActionListener(this);
        sonuc.addActionListener(this);


        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sonucEkrani.setText("");
            }
        });
    }

    private int number1 = 0;
    private int number2 = 0;
    private String operator;


    public void actionPerformed(ActionEvent e) {

        String buttonText = ((JButton) e.getSource()).getText();

        if (buttonText.matches("[0-9]")){
            while (e.getSource() instanceof JButton) {
                sonucEkrani.setText(sonucEkrani.getText() + buttonText);
                break;
            }
        }else if (buttonText.equals("+")){
            number1 = Integer.parseInt(sonucEkrani.getText());
            operator = "+";
            sonucEkrani.setText("");
        }else if (buttonText.equals("-")){
            number1 = Integer.parseInt(sonucEkrani.getText());
            operator = "-";
            sonucEkrani.setText("");
        }else if (buttonText.equals("*")){
            number1 = Integer.parseInt(sonucEkrani.getText());
            operator = "*";
            sonucEkrani.setText("");
        }else if (buttonText.equals("/")){
            number1 = Integer.parseInt(sonucEkrani.getText());
            operator = "/";
            sonucEkrani.setText("");
        }else if (buttonText.equals("=")) {
            number2 = Integer.parseInt(sonucEkrani.getText());
            if (operator.equals("+")){
                sonucEkrani.setText(String.valueOf(number1 + number2));
            }
            if (operator.equals("-")){
                sonucEkrani.setText(String.valueOf(number1 - number2));
            }
            if (operator.equals("*")){
                sonucEkrani.setText(String.valueOf(number1 * number2));
            }
            if (operator.equals("/")){
                sonucEkrani.setText(String.valueOf((double) number1 / number2));
            }
        }

    }

}
