import javax.swing.*;
import java.awt.*;

public class Caculator extends JFrame {
    public Caculator() throws HeadlessException {
        initComponents();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EnglishTestQuestion().setVisible(true));
    }

    protected void initComponents() {

        setSize(700, 400);
        setTitle("Samsung Notes");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        setLocation(460, 260);

        JTextField AB = new JTextField();
        AB.setPreferredSize(new Dimension(10000, 10000));
        getContentPane().add(AB);
    }
}