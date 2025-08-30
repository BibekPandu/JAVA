import javax.swing.*;
import java.awt.*;

public class BorderLayoutUnique extends JFrame {
    public BorderLayoutUnique() {
        setTitle("Unique BorderLayout Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use BorderLayout with gaps
        setLayout(new BorderLayout(10, 10));

        // North (title panel with a label)
        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.LIGHT_GRAY);
        northPanel.add(new JLabel("Welcome to My App"));
        add(northPanel, BorderLayout.NORTH);

        // South (footer with a button)
        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.DARK_GRAY);
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));
        southPanel.add(exitButton);
        add(southPanel, BorderLayout.SOUTH);

        // East (panel with vertical buttons)
        JPanel eastPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        eastPanel.setBackground(Color.PINK);
        eastPanel.add(new JButton("Option 1"));
        eastPanel.add(new JButton("Option 2"));
        eastPanel.add(new JButton("Option 3"));
        add(eastPanel, BorderLayout.EAST);

        // West (colored panel with labels)
        JPanel westPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        westPanel.setBackground(Color.CYAN);
        westPanel.add(new JLabel("Menu Item A"));
        westPanel.add(new JLabel("Menu Item B"));
        add(westPanel, BorderLayout.WEST);

        // Center (main content area with text area)
        JTextArea textArea = new JTextArea("This is the main content area.");
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutUnique();
    }
}
