import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App extends JFrame implements ActionListener {

    private JLabel nameLabel, majorLabel, uniNumLabel, ageLabel, idNumLabel;
    private JTextField majorField, uniNumField, ageField, idNumField;
    private JComboBox<String> namesBox;
    private JButton searchButton, clearButton, exitButton;

    cred yousef = new cred("Yousef Musabeh", "AI", 22110388, 18, 221123948);
    cred ahmad = new cred("Ahmad Ibrahim", "CS", 22110234, 19, 223345667);
    cred saud = new cred("Saud Smadi", "Cyber", 22110002, 18, 221344566);
    cred amro = new cred("Amro Dannoun", "Cyber", 22110248, 18, 22332243);

    public App() {
        super("My ID Program");
        setLayout(new GridLayout(7, 5, 10, 10)); // set layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ! names box
        nameLabel = new JLabel(" Choose the name:");
        add(nameLabel);
        String[] names = { " ", yousef.name, ahmad.name, amro.name, saud.name };
        namesBox = new JComboBox<String>(names);
        add(namesBox);

        // ! najor field
        majorLabel = new JLabel(" Major:");
        add(majorLabel);
        majorField = new JTextField(10);
        majorField.setEditable(false);
        add(majorField);

        // ! uniNum field
        uniNumLabel = new JLabel(" University Number:");
        add(uniNumLabel);
        uniNumField = new JTextField(10);
        uniNumField.setEditable(false);
        add(uniNumField);

        // ! ageLabel field
        ageLabel = new JLabel(" Age:");
        add(ageLabel);
        ageField = new JTextField(10);
        ageField.setEditable(false);
        add(ageField);

        // ! ageLabel field
        idNumLabel = new JLabel(" ID Number:");
        add(idNumLabel);
        idNumField = new JTextField(10);
        idNumField.setEditable(false);
        add(idNumField);

        // ! search button
        searchButton = new JButton("Search");
        searchButton.addActionListener(this);
        add(searchButton);

        // ! clear button
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        add(clearButton);

        // ! exit button
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        add(exitButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String names = (String) namesBox.getSelectedItem();
        if (e.getSource() == searchButton) {
            if (names == yousef.name) {
                majorField.setText(yousef.major);
                idNumField.setText(String.format("%d", yousef.idNum));
                uniNumField.setText(String.format("%d", yousef.uniNum));
                ageField.setText(String.format("%d", yousef.age));

            } else if (names == ahmad.name) {
                majorField.setText(ahmad.major);
                idNumField.setText(String.format("%d", ahmad.idNum));
                uniNumField.setText(String.format("%d", ahmad.uniNum));
                ageField.setText(String.format("%d", ahmad.age));

            } else if (names == amro.name) {
                majorField.setText(amro.major);
                idNumField.setText(String.format("%d", amro.idNum));
                uniNumField.setText(String.format("%d", amro.uniNum));
                ageField.setText(String.format("%d", amro.age));

            } else if (names == saud.name) {
                majorField.setText(saud.major);
                idNumField.setText(String.format("%d", saud.idNum));
                uniNumField.setText(String.format("%d", saud.uniNum));
                ageField.setText(String.format("%d", saud.age));
            } else if (names == " ") {
                majorField.setText(" ");
                idNumField.setText("");
                uniNumField.setText(" ");
                ageField.setText("");
            }
        } else if (e.getSource() == clearButton) {
            majorField.setText("");
            idNumField.setText("");
            uniNumField.setText("");
            ageField.setText("");
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new App();
    }

}
