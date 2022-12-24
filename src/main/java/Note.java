import javax.swing.*;
import java.awt.*;

public class Note extends JFrame {
    public Note() throws HeadlessException {
        initComponents();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Note().setVisible(true));
    }

    protected void initComponents() {

        setSize(700, 400);
        setTitle("Samsung Notes");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        setLocation(460, 260);

        JTextField AB = new JTextField();
        AB.setPreferredSize(new Dimension(500, 20));
        getContentPane().add(AB);
    }
}