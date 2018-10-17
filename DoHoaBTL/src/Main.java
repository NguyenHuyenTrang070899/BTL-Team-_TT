

import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import  java.awt.Color;

class Dictionary extends JFrame implements ActionListener{
    JTextField Input;
    JTextArea Output;
    JButton b1,b2,b3;
    JLabel english,vietnamese;
    JPanel pn,pn1,pn2;
    Search Dic = new  Search();
    private final Border raisedBevel = BorderFactory.createRaisedBevelBorder();
    Dictionary(){

        super("Dictionary Anh - Việt");
        Input = new JTextField();
        Input.setBounds(20,40,170,30);
        
        Output = new JTextArea();
        Output.setBounds(290,40,350,400);
        Output.setFocusable(false);
        Output.setLineWrap(true);
        Output.setWrapStyleWord(true);

        b1 = new JButton("Dịch");
        b1.setBounds(200,40,70,30);

        b2 = new JButton("Thêm");
        b2.setBounds(200,80,70,30);

        b3 = new JButton("Xóa");
        b3.setBounds(200,120,70,30);

        english = new JLabel("Anh");
        vietnamese = new JLabel("Việt");

        english.setBounds(30,10,50,30);
        vietnamese.setBounds(150,10,50,30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
 
        pn = new JPanel();
        pn.setLayout(null);
        pn.setBackground(new Color(139, 87, 39));
        pn.add(b1);pn.add(Input); pn.add(Output); pn.add(b2);pn.add(b3);
        pn.add(english);pn.add(vietnamese);
        add(pn);
        setSize(700,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
                Output.setText( Dic.search(Input.getText()) );          
            }
    }
    public static void main(String[] args) {
       new Dictionary();
    }
}
