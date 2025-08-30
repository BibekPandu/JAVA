import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    public LoginForm() {
        setTitle("Login Form");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        // Labels and Fields
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        // Button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        // Add components
        add(userLabel);
        add(usernameField);
        add(passLabel);
        add(passwordField);
        add(new JLabel("")); // spacer
        add(loginButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Hardcoded username and password
        if (username.equals("Bibek") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Access Granted ✅");
        } else {
            JOptionPane.showMessageDialog(this, "Access Denied ❌");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
