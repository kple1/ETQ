import javax.swing.*;
import java.awt.*;

public class EnglishTestQuestion extends JFrame{
    JTextField a = new JTextField(20);
    JTextArea b = new JTextArea(7, 20);

    EnglishTestQuestion() {
        setTitle("유찬이의 영어단어 시험");
        setSize(850, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("complain"));
        c.add(a);
        c.add(new JLabel("work"));
        c.add(a);
    }
    public static void main(String[] args) {
        new EnglishTestQuestion();

        }
    }