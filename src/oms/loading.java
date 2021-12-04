package oms;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public class loading extends JFrame implements ActionListener{
    public static void main(String[] args){
        loading l = new loading();
        l.setVisible (true);
        l.iterate();
    }
    int i = 0, num = 0;
    JProgressBar j = new JProgressBar(0,500);
    ImageIcon img = new ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\oms\\src\\oms\\Icons\\loadinglogo.jpg");
    ImageIcon logo = new ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\oms\\src\\oms\\icon\\orderit.png");
    loading(){
 
        setBounds(370,160,600,400);               /*frame*/
        setResizable(false);
        setUndecorated(true);
        JLabel lb = new JLabel(img);
        lb.setBounds(0,0,600,383);
        add(lb);
        JLabel lb2 = new JLabel(logo);
        lb2.setBounds(20,20,143,50);
        lb.add(lb2);

        j.setBounds(0,380,600,20);             /* Progressbar*/
        j.setValue(0);
        j.setStringPainted(true);
        j.setBorderPainted(true);
        j.setBackground(Color.white);
        j.setForeground(new Color(178,34,34));

        add(j);
        setLayout(null);

        JButton b1 = new JButton("NEXT");                     /*button*/
        b1.setBounds(200, 100 , 100, 25);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        lb.add(b1);

    }

    public void iterate (){
        while(i<=2000){
            j.setValue(i);
            i=i+30;


            try{Thread.sleep(150);}
            catch(Exception e ){}
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Login().setVisible(true);
        this.setVisible(false);


    }
}

