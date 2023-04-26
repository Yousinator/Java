import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App extends JFrame implements ActionListener {
    private JLabel num1Label, operationLabel, num2Label, resultLabel;
    private JTextField num1Field, num2Field, resultField;
    private JComboBox<String> operationBox;
    private JButton calculateButton, clearButton, exitButton;
    Calculator calc = new Calculator(11, 10);

    public App() {
        super("App");
        setLayout(new GridLayout(7, 5, 10, 10)); // set layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create and add labels
        num1Label = new JLabel("Enter the first number:");
        add(num1Label);
        num1Field = new JTextField(10);
        add(num1Field);

        operationLabel = new JLabel("Select the operation:");
        add(operationLabel);
        String[] operations = { "+", "-", "*", "/" };
        operationBox = new JComboBox<String>(operations);
        add(operationBox);

        num2Label = new JLabel("Enter the second number:");
        add(num2Label);
        num2Field = new JTextField(10);
        add(num2Field);

        resultLabel = new JLabel("Result:");
        add(resultLabel);
        resultField = new JTextField(10);
        resultField.setEditable(false);
        add(resultField);

        // create and add buttons

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);
        add(clearButton);

        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        add(exitButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                calc.setnum1(Double.parseDouble(num1Field.getText()));
                calc.setnum2(Double.parseDouble(num2Field.getText()));
                String operation = (String) operationBox.getSelectedItem();
                double result = 0;

                switch (operation) {
                    case "+":
                        result = calc.add();
                        break;
                    case "-":
                        result = calc.subtract();
                        break;
                    case "*":
                        result = calc.multiply();
                        break;
                    case "/":
                        result = calc.divide();
                        break;
                }

                resultField.setText(String.format("%.2f", result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == clearButton) {
            num1Field.setText("");
            num2Field.setText("");
            resultField.setText("");
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new App();
    }
}