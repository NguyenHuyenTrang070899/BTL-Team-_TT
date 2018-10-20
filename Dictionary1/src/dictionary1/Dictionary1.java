package dictionary1;

import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;

public class Dictionary1 {
    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());

        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

}
