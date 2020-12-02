import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputListener implements ActionListener {
    private JTextField inputField;
    private JTextArea messageArea;

    public InputListener(JTextField inputField, JTextArea messageArea) {
        this.inputField = inputField;
        this.messageArea = messageArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder message = new StringBuilder(messageArea.getText());
        message.append("\n").append(inputField.getText());
        messageArea.setText(message.toString());
        inputField.setText("");

    }

}
