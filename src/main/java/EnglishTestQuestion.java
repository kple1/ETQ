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
        setTitle("아이네가 좋아할것같은 영어단어 시험문제");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        setLocation(460, 260);


        JLabel AA = new JLabel("require: ");
        JTextField AB = new JTextField();
        AB.setPreferredSize(new Dimension(100, 20));
        getContentPane().add(AA);
        getContentPane().add(AB);

        AB.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if (text.equals("요구하다")){
                    AB.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                } else {
                    AB.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
        });
        JLabel AC = new JLabel("technology: ");
        JTextField AD = new JTextField();
        AD.setPreferredSize(new Dimension(100, 20));
        getContentPane().add(AC);
        getContentPane().add(AD);

        AD.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if (text.equals("과학기술")){
                    AD.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                } else {
                    AD.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
        });
        JLabel AE = new JLabel("individual: ");
        JTextField AF = new JTextField();
        AF.setPreferredSize(new Dimension(100, 20));
        getContentPane().add(AE);
        getContentPane().add(AF);

        AF.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if (text.equals("개인")){
                    AF.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                } else {
                    AF.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
        });

        JLabel AG = new JLabel("provide: ");
        JTextField AH = new JTextField();
        AH.setPreferredSize(new Dimension(100, 20));
        getContentPane().add(AG);
        getContentPane().add(AH);

        AH.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if (text.equals("공급하다")){
                    AH.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                } else {
                    AH.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
        });

        JLabel AI = new JLabel("object: ");
        JTextField AJ = new JTextField();
        AJ.setPreferredSize(new Dimension(100, 20));
        getContentPane().add(AI);
        getContentPane().add(AJ);

        AJ.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if (text.equals("물체")){
                    AJ.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                } else {
                    AJ.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
        });

        JLabel AK = new JLabel("level: ");
        JTextField AL = new JTextField();
        AL.setPreferredSize(new Dimension(100, 20));
        getContentPane().add(AK);
        getContentPane().add(AL);

        AL.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if (text.equals("수준")||text.equals("정도")){
                    AL.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                } else {
                    AL.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
        });

        JLabel AM = new JLabel("involve: ");
        JTextField AN = new JTextField();
        AN.setPreferredSize(new Dimension(100, 20));
        getContentPane().add(AM);
        getContentPane().add(AN);

        AN.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if (text.equals("포함하다")||text.equals("관계하다")){
                    AN.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                } else {
                    AN.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
        });

        JLabel AO = new JLabel("employ : ");
        JTextField AP = new JTextField();
        AP.setPreferredSize(new Dimension(100, 20));
        getContentPane().add(AO);
        getContentPane().add(AP);

        AP.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if (text.equals("고용하다")){
                    AP.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                } else {
                    AP.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
        });

        JLabel AQ = new JLabel("attitude : ");
        JTextField AR = new JTextField();
        AR.setPreferredSize(new Dimension(100, 20));
        getContentPane().add(AQ);
        getContentPane().add(AR);
        AR.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if (text.equals("태도")){
                    AR.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                } else {
                    AR.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
        });
    }
}