import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddTwoNumbers extends JFrame implements ActionListener {
    JTextField num1Field, num2Field, resultField;
    JButton addButton;

    public AddTwoNumbers() {
        setTitle("Add Two Numbers");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));

        JLabel num1Label = new JLabel("Enter First Number:");
        JLabel num2Label = new JLabel("Enter Second Number:");
        JLabel resultLabel = new JLabel("Result:");

        num1Field = new JTextField();
        num2Field = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        addButton = new JButton("Add");
        addButton.addActionListener(this);

        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(new JLabel("")); // spacer
        add(addButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double sum = num1 + num2;
            resultField.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new AddTwoNumbers();
    }
}
