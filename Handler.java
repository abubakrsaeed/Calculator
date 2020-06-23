import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Handler implements ActionListener {

    private JLabel label;

    public Handler(JLabel label) {
        this.label = label;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton) {
            JButton b = (JButton) e.getSource();

            if (b.getText().equals("=")) {
                if (label.getText().contains("+")) {
                    String arr[] = label.getText().trim().split("\\+");
                    double sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        double number = Double.parseDouble(arr[i]);
                        sum += number;
                    }
                    label.setText("" + sum);
                }
                else if (label.getText().contains("x")) {
                    String arr[] = label.getText().trim().split("x");
                    double multiply = 1;
                    for (int i = 0; i < arr.length; i++) {
                        double number = Double.parseDouble(arr[i]);
                        multiply *= number;
                    }
                    label.setText("" + multiply);
                }
                else if (label.getText().contains("-")) {
                    String arr[] = label.getText().trim().split("-");
                    double subtract = 0;
                    if (arr.length > 1) {
                        subtract = Double.parseDouble(arr[0]);
                        for (int i = 1; i < arr.length; i++) {
                            double number = Double.parseDouble(arr[i]);
                            subtract -= number;
                        }
                    }
                    label.setText("" + subtract);
                }
                else if (label.getText().contains("/")) {
                    String arr[] = label.getText().trim().split("/");
                    double divide = 0;
                    for (int i = 0; i < arr.length; i++) {
                        double number = Double.parseDouble(arr[i]);
                        if (i == 0)
                            divide = number;
                        else
                            divide = divide / number;
                    }
                    label.setText("" + divide);
                }
            }
            else if (b.getText().equals("C")) {
                label.setText(" ");
            }
            else {
                label.setText(label.getText() + b.getText());
            }
        }
    }
}
