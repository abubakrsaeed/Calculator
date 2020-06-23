import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel topPanel = new JPanel();
        frame.add(topPanel, BorderLayout.NORTH);
        topPanel.setBackground(Color.WHITE);
        topPanel.setLayout(new BorderLayout());

        JLabel label = new JLabel(" ");
        label.setFont(new Font("Courier", Font.PLAIN, 20));
        topPanel.add(label, BorderLayout.EAST);

        Handler handler = new Handler (label);

        JPanel mainPanel = new JPanel();
        frame.add(mainPanel, BorderLayout.CENTER);
        mainPanel.setLayout(new GridLayout(5, 4));

        mainPanel.add(new JOperandButton("", handler));
        mainPanel.add(new JOperandButton("", handler));
        mainPanel.add(new JOperandButton("", handler));
        mainPanel.add(new JOperandButton("C", handler));
        mainPanel.add(new JOperandButton("7", handler));
        mainPanel.add(new JOperandButton("8", handler));
        mainPanel.add(new JOperandButton("9", handler));
        mainPanel.add(new JOperatorButton("/", handler));
        mainPanel.add(new JOperandButton("4", handler));
        mainPanel.add(new JOperandButton("5", handler));
        mainPanel.add(new JOperandButton("6", handler));
        mainPanel.add(new JOperatorButton("x", handler));
        mainPanel.add(new JOperandButton("1", handler));
        mainPanel.add(new JOperandButton("2", handler));
        mainPanel.add(new JOperandButton("3", handler));
        mainPanel.add(new JOperatorButton("-", handler));
        mainPanel.add(new JOperandButton("0", handler));
        mainPanel.add(new JOperandButton(".", handler));
        mainPanel.add(new JOperatorButton("=", handler));
        mainPanel.add(new JOperatorButton("+", handler));

        frame.setVisible(true);
    }
}
