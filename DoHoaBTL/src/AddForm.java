import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddForm extends JDialog {
    private static final long serialVersionUID = 1L;
    public AddForm(String title){
        setTitle("Thêm từ");
        setForm();
    }
    public void setForm(){
        JPanel pn = new JPanel();
        JLabel l = new JLabel("Nghĩa");
        JTextField txt1=new JTextField(15);
        JButton btn1=new JButton("Thêm");
        pn.add(btn1);
        pn.add(txt1);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Đã thêm");
            }
        });
        Container con = getContentPane();
        con.add(pn);
        setSize(300, 200);
        setLocationRelativeTo(null);
    }
}

