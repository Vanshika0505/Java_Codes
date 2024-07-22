import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VowelCounter {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                VowelCounter window = new VowelCounter();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public VowelCounter() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Vowel Counter");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(10, 10, 320, 40);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setEditable(false);
        textField_1.setBounds(10, 60, 320, 40);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JButton btnCountVowel = new JButton("CountVowel");
        btnCountVowel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                int vowelCount = countVowels(input);
                textField_1.setText("Number of vowels: " + vowelCount);
            }
        });
        btnCountVowel.setBounds(10, 110, 117, 25);
        frame.getContentPane().add(btnCountVowel);

        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                textField_1.setText("");
            }
        });
        btnReset.setBounds(147, 110, 117, 25);
        frame.getContentPane().add(btnReset);

        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnExit.setBounds(284, 110, 117, 25);
        frame.getContentPane().add(btnExit);
    }

    private int countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}