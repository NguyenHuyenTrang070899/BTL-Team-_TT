
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
import java.util.ArrayList;

class Dictionary extends JFrame implements ActionListener{
    JTextField Input;
    JTextArea Output1;
    JTextArea Output2;
    JButton b1,b2,b3;
    JLabel english,vietnamese;
    JPanel pn;
    Search Se = new  Search();
    private final Border raisedBevel = BorderFactory.createRaisedBevelBorder();
    Dictionary(){

        super("Dictionary Anh - Việt");
        Input = new JTextField();
        Input.setBounds(20,40,170,30);

        Output1 = new JTextArea();
        Output1.setBounds(300,40,350,400);
        Output1.setFocusable(false);
        Output1.setLineWrap(true);
        Output1.setWrapStyleWord(true);

        Output2 = new JTextArea();
        Output2.setBounds(20,80,170,360);
        Output2.setFocusable(false);

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
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddForm af = new AddForm("Thêm");
                af.setModal(true);
                af.setVisible(true);
            }
        });
        b3.addActionListener(this);

        pn = new JPanel();
        pn.setLayout(null);
        pn.setBackground(new Color(139, 87, 39));
        pn.add(b1);pn.add(Input); pn.add(Output1); pn.add(Output2); pn.add(b2);pn.add(b3);
        pn.add(english);pn.add(vietnamese);
        add(pn);
        setSize(700,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            Output1.setText( Se.search(Input.getText()) );
        }

    }
    public static void main(String[] args) {
        new Dictionary();
    }
}
