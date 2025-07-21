import javax.swing.*;
import java.awt.*;

public class BloodDonationDashboard extends JFrame {

    public BloodDonationDashboard() {
        setTitle("Blood Donation Dashboard");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center screen
        setLayout(new BorderLayout(10, 10));

        JLabel headerLabel = new JLabel("Blood Donation Dashboard", JLabel.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(headerLabel, BorderLayout.NORTH);

        JPanel mainPanel = new JPanel(new GridLayout(1, 3, 10, 10));

        // Registration Panel
        JPanel registerPanel = new JPanel();
        registerPanel.setBorder(BorderFactory.createTitledBorder("Registration"));
        registerPanel.setLayout(new GridLayout(8, 1, 5, 5));

        JTextField nameField = new JTextField("Enter your name");
        JTextField bloodGroupField = new JTextField();
        JTextField contactNumberField = new JTextField("Enter your phone number");
        JTextField emailField = new JTextField();
        JTextField lastDonationDateField = new JTextField(); // date picker placeholder
        JTextField locationField = new JTextField("Enter your current location");
        JTextField usernamePhoneField = new JTextField("Enter your phone number for username");
        JButton registerButton = new JButton("Register");

        registerPanel.add(labeledField("Name:", nameField));
        registerPanel.add(labeledField("Blood Group:", bloodGroupField));
        registerPanel.add(labeledField("Contact Number:", contactNumberField));
        registerPanel.add(labeledField("Email:", emailField));
        registerPanel.add(labeledField("Last Donation Date:", lastDonationDateField));
        registerPanel.add(labeledField("Location:", locationField));
        registerPanel.add(labeledField("Username Phone:", usernamePhoneField));
        registerPanel.add(registerButton);

        // Signup Panel
        JPanel signupPanel = new JPanel();
        signupPanel.setBorder(BorderFactory.createTitledBorder("Signup"));
        signupPanel.setLayout(new GridLayout(4, 1, 5, 5));

        JTextField signupIdField = new JTextField();
        signupIdField.setEditable(false); // comes from registration
        JTextField signupPasswordField = new JTextField("Enter a strong password");
        JTextField signupConfirmPasswordField = new JTextField();
        JButton signupButton = new JButton("Signup");

        signupPanel.add(labeledField("ID:", signupIdField));
        signupPanel.add(labeledField("Password:", signupPasswordField));
        signupPanel.add(labeledField("Confirm Password:", signupConfirmPasswordField));
        signupPanel.add(signupButton);

        // Login Panel
        JPanel loginPanel = new JPanel();
        loginPanel.setBorder(BorderFactory.createTitledBorder("Login"));
        loginPanel.setLayout(new GridLayout(3, 1, 5, 5));

        JTextField loginIdField = new JTextField("Enter your phone number that you used for registration and signed up");
        JTextField loginPasswordField = new JTextField("Enter your password");
        JButton loginButton = new JButton("Login");

        loginPanel.add(labeledField("ID:", loginIdField));
        loginPanel.add(labeledField("Password:", loginPasswordField));
        loginPanel.add(loginButton);

        // Add Panels to mainPanel
        mainPanel.add(registerPanel);
        mainPanel.add(signupPanel);
        mainPanel.add(loginPanel);

        add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel labeledField(String labelText, JTextField textField) {
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.add(new JLabel(labelText), BorderLayout.WEST);
        panel.add(textField, BorderLayout.CENTER);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BloodDonationDashboard::new);
    }
}