import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EnglishTestQuestion extends JFrame {
    public EnglishTestQuestion() throws HeadlessException {
        initComponents();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EnglishTestQuestion().setVisible(true));
    }

    protected void initComponents() {

        setSize(700, 400);
        setTitle("유찬이의 영어단어 시험");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));


        JLabel ETQLABEL = new JLabel("Complain: ");
        JTextField ETF = new JTextField();
        ETF.setPreferredSize(new Dimension(150, 20));
        getContentPane().add(ETQLABEL);
        getContentPane().add(ETF);

        ETF.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if (text == "asd") {
                    ETF.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                } else {
                    ETF.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
        });
    }
}