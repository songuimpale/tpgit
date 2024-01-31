import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserForm extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JButton saveButton;

    public UserForm() {
        setTitle("User Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        add(firstNameField);

        add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        add(lastNameField);

        saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveUser();
            }
        });
        add(saveButton);
    }

    private void saveUser() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        User user = new User(firstName, lastName);
        // Ici, vous pouvez ajouter la logique pour enregistrer l'utilisateur
        JOptionPane.showMessageDialog(this, "User saved: " + user.getFirstName() + " " + user.getLastName());
    }
}
