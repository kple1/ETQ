import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Timer extends JFrame {
    public Timer() throws HeadlessException {
        initComponents();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Timer().setVisible(true));
    }
    protected void initComponents() {

/** JFrame Settings */

        setTitle("Timer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);

/** Time Setting */

        JLabel j2 = new JLabel("시 :");
        JTextField j3 = new JTextField();
        j2.setLocation(400, 400);
        j3.setLocation(430, 400);
        j3.setPreferredSize(new Dimension(100, 20));
        getContentPane().add(j2);
        getContentPane().add(j3);

        j3.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if (text.equals("")) {
                } else {

                }
            }
        });
    }
}
