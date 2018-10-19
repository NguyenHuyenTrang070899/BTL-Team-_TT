import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JDialog;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JTextField;

public class AddForm extends JDialog{

    private static final long serialVersionUID = 1L;

    public AddForm(String title)

    {

        setTitle("Them");

        doAddSomeControl();

    }


    public void doAddSomeControl()

    {

        JPanel pn=new JPanel();
        pn.setBackground(new Color(23,54,250));
        pn.setLayout(null);

        JLabel l1 = new JLabel("Nhap tu");
        l1.setBounds(0,0,70,50);
        l1.setForeground(new java.awt.Color(100,200,40));

        JLabel l2 = new JLabel("Nhap nghia");
        l2.setBounds(0,40,70,50);
        l2.setForeground(new java.awt.Color(100,200,40));

        JTextField txt1=new JTextField();
        txt1.setBounds(80,15,150,20);
        JTextField txt2=new JTextField();
        txt2.setBounds(80,55,150,20);
        JButton button1=new JButton("Add");

        button1.setBounds(105,100,70,30);
        pn.add(button1);
        pn.add(l1);
        pn.add(l2);
        pn.add(txt1);
        pn.add(txt2);
        add(pn);
        button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"Da them");

            }

        });
        Container con=getContentPane();

        con.add(pn);

        setSize(300, 200);

        setLocationRelativeTo(null);

    }

}