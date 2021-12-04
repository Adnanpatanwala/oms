 
package oms;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JLabel l1,l2,j,lb;
    JTextField t1,t2;
    JButton b1,b2;
    ImageIcon img = new ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\ordermanagement\\src\\main\\java\\com\\mycompany\\ordermanagement\\icon\\loginfinal2.png");
    ImageIcon logo = new ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\ordermanagement\\src\\main\\java\\com\\mycompany\\ordermanagement\\icon\\ot1.png");
    Login(){
        setBounds(370,160,600,400);
        JLabel l = new JLabel(img);
        l.setBounds(0,  0, 600, 400);
        add(l);
        JLabel l2 = new JLabel(logo);
        l2.setBounds(229,0,143,50);
        l.add(l2);
        setResizable(false);

        l1 = new JLabel("USERNAME  : ");                           /*text*/
        l1.setBounds(250,90,100,25);
        l1.setForeground(Color.BLACK);
        l.add(l1);

        l2 = new JLabel("PASSWORD : ");                            /*text*/
        l2.setBounds(250,140,100,25);
        l2.setForeground(Color.BLACK);
        l.add(l2);

        t1= new JTextField();                                             /*textfield*/
        t1.setBounds(340,90,150,25);
        l.add(t1);

        t2 = new JPasswordField();                                      /*textfield*/
        t2.setBounds(340,140,150,25);
        l.add(t2);


        b1= new JButton("LOGIN");                                   /*button*/
        b1.setBounds(250,200,90,25);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        l.add(b1);

        b2 = new JButton("CANCEL");                                 /*button*/
        b2.setBounds(390,200,90,25);
        b2.setBackground(Color.WHITE);
        b2.addActionListener(this);
        b2.setForeground(Color.BLACK);
        l.add(b2);


        setVisible(true);
    }



    public static void main(String[] args){
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            try{
                connect c1 = new connect();
                String u = t1.getText();
                String v = t2.getText();
                String q = "select * from login where username='"+u+"' and password='"+v+"'";

                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){
                    new dashboard().setVisible( true);
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid login");

                    setVisible(false);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==b2){
            System.exit(0);
        }



    }


}



