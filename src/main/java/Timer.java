import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.TimerTask;

public class Timer extends JFrame{
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
        setLayout(null);

/**  00H:00M:00S */



/** Hour Setting */

        JLabel j2 = new JLabel("시 :");
        JTextField j3 = new JTextField();
        j2.setLocation(30,400);
        j2.setSize(80,30);
        j3.setLocation(50,400);
        j3.setSize(100, 30);
        getContentPane().add(j2);
        getContentPane().add(j3);
        j3.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if (text.equals(" ")) {
                } else {

                }
            }
        });
/** Minute Setting */
        JLabel j4 = new JLabel("분 :");
        JTextField j5 = new JTextField();
        j4.setLocation(160,400);
        j4.setSize(80,30);
        j5.setLocation(180,400);
        j5.setSize(100, 30);
        getContentPane().add(j4);
        getContentPane().add(j5);
        j5.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if (text.equals("")) {
                } else {

                }
            }
        });
/** Second Setting */
        JLabel j6 = new JLabel("초 :");
        JTextField j7 = new JTextField();
        j6.setLocation(290,400);
        j6.setSize(80,30);
        j7.setLocation(310,400);
        j7.setSize(100, 30);
        getContentPane().add(j6);
        getContentPane().add(j7);
        j7.addKeyListener(new KeyAdapter() {
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
