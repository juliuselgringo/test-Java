import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormulaireGUI {

    public static void main(String[] args) {
        JFrame formFrame = new JFrame("Formulaire Prénom et Age");
        formFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formFrame.setSize(300,200);

        JPanel formPanel = new JPanel();
        formFrame.add(formPanel);
        placeComponents(formPanel);

        formFrame.setVisible(true);

    }

    public static void placeComponents(JPanel formPanel) {
        formPanel.setLayout(null);

        JLabel firstNameLabel = new JLabel("Prénom: ");
        firstNameLabel.setBounds(10,20,80,25);
        formPanel.add(firstNameLabel);

        JTextField firstNameTextField = new JTextField(20);
        firstNameTextField.setBounds(100, 20, 165, 25);
        formPanel.add(firstNameTextField);

        JLabel ageLabel = new JLabel("Age");
        ageLabel.setBounds(10,50,80,25);
        formPanel.add(ageLabel);

        JTextField ageField = new JTextField(20);
        ageField.setBounds(100,50,165,25);
        formPanel.add(ageField);

        JButton formButton = new JButton("Enregistrer");
        formButton.setBounds(10, 80,255,25);
        formPanel.add(formButton);

        formButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameTextField.getText();
                String age = ageField.getText();
                JOptionPane.showMessageDialog(formPanel, "Hello " + firstName + " you have " + age + " ans");
            }
        });
    }
}
