
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
    JButton b1,b2,b3,b4;
    JLabel english,vietnamese;
    JPanel pn,pn1,pn2;
    dictionnary Dic = new  dictionnary();
    static boolean anhViet = true;
    private final Border raisedBevel = BorderFactory.createRaisedBevelBorder();
    Dictionary(){

        super("Dictionary Anh - Việt");
        Input = new JTextField();
        Input.setBounds(20,40,170,30);

        Output = new JTextArea();
        Output.setBounds(290,40,350,400);
        Output.setFocusable(false);

        b1=new JButton("Dịch");
        b1.setBackground(Color.gray);
        b1.setBounds(200,40,70,30);

        b2 = new JButton("Thêm");
        b2.setBackground(Color.gray);
        b2.setBounds(200,80,70,30);

        b3 = new JButton("Xóa");
        b3.setBackground(Color.gray);
        b3.setBounds(200,120,70,30);

        english = new JLabel("Anh");
        vietnamese = new JLabel("Việt");

        english.setBounds(30,10,50,30);
        vietnamese.setBounds(150,10,50,30);


        b4 = new JButton(">");
        b4.setBackground(new Color(205 , 98, 125));
        b4.setBounds(70,15,50,20);
        b4.setFont(new Font("Tahoma",Font.PLAIN,14));

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        pn = new JPanel();
        pn.setLayout(null);
        pn.setBackground(new Color(139, 87, 39));
        pn.add(b1);pn.add(Input); pn.add(Output); pn.add(b2);pn.add(b3); pn.add(b4);
        pn.add(english);pn.add(vietnamese);
        add(pn);
        setSize(700,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            if(anhViet)
                Output.setText("<html>" + Dic.searchAnhViet(Input.getText()) + "</html>");
            else
                Output.setText("  * " + Dic.searchVietAnh(Input.getText()));
        }
        if(e.getSource()==b4){
            if(anhViet){
                english.setBounds(150,10,50,30);
                vietnamese.setBounds(30,10,50,30);
                anhViet = false;
            }
            else {
                english.setBounds(30,10,50,30);
                vietnamese.setBounds(150,10,50,30);
                anhViet = true;
            }

        }
    }
    public static void main(String[] args) {
        new Dictionary();
    }
}
