import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentForm extends JFrame implements ActionListener {
    JTextField firstNameField, lastNameField, ageField;
    JRadioButton maleRadio, femaleRadio, otherRadio;
    JComboBox<String> facultyBox, semesterBox;
    JTextArea remarksArea;
    JButton submitButton;

    public StudentForm() {
        setTitle("Asian College - Student Record Form");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // First Name
        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("First Name:"), gbc);
        firstNameField = new JTextField(15);
        gbc.gridx = 1; 
        add(firstNameField, gbc);

        // Last Name
        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Last Name:"), gbc);
        lastNameField = new JTextField(15);
        gbc.gridx = 1;
        add(lastNameField, gbc);

        // Age
        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Age:"), gbc);
        ageField = new JTextField(5);
        gbc.gridx = 1;
        add(ageField, gbc);

        // Gender
        gbc.gridx = 0; gbc.gridy = 3;
        add(new JLabel("Gender:"), gbc);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        otherRadio = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderGroup.add(otherRadio);
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        genderPanel.add(otherRadio);
        gbc.gridx = 1;
        add(genderPanel, gbc);

        // Faculty
        gbc.gridx = 0; gbc.gridy = 4;
        add(new JLabel("Faculty:"), gbc);
        String[] faculties = {"BSc CSIT", "BCA", "BBM", "BBS", "BHM"};
        facultyBox = new JComboBox<>(faculties);
        gbc.gridx = 1;
        add(facultyBox, gbc);

        // Semester
        gbc.gridx = 0; gbc.gridy = 5;
        add(new JLabel("Semester:"), gbc);
        String[] semesters = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"};
        semesterBox = new JComboBox<>(semesters);
        gbc.gridx = 1;
        add(semesterBox, gbc);

        // Remarks
        gbc.gridx = 0; gbc.gridy = 6;
        add(new JLabel("Remarks:"), gbc);
        remarksArea = new JTextArea(4, 15);
        JScrollPane remarksScroll = new JScrollPane(remarksArea);
        gbc.gridx = 1;
        add(remarksScroll, gbc);

        // Submit Button
        gbc.gridx = 1; gbc.gridy = 7;
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton, gbc);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String age = ageField.getText();
        String gender = maleRadio.isSelected() ? "Male" : 
                        femaleRadio.isSelected() ? "Female" : 
                        otherRadio.isSelected() ? "Other" : "Not Selected";
        String faculty = (String) facultyBox.getSelectedItem();
        String semester = (String) semesterBox.getSelectedItem();
        String remarks = remarksArea.getText();

        JOptionPane.showMessageDialog(this,
                "Student Record:\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Faculty: " + faculty + "\n" +
                "Semester: " + semester + "\n" +
                "Remarks: " + remarks,
                "Record Saved",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
