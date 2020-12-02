import javax.swing.*;
import java.awt.*;

public class CentreFrame {
    private JPanel panel;
    private JTextField inputField;
    private JTextArea messageArea;

    public CentreFrame() {
        this.panel = new JPanel();
        this.inputField = new JTextField();
        this.messageArea = new JTextArea();
        init();
    }

    public void init() {
        JPanel bottom = new JPanel();

        panel.setLayout(new BorderLayout());
        bottom.setLayout(new GridLayout(1, 2));
        panel.setBackground(new Color(255, 255, 255));

        messageArea.setBackground(new Color(200, 200, 200));
        messageArea.setLineWrap(true);
        messageArea.setEditable(false);
        messageArea.setToolTipText("It's magic!");
        panel.add(messageArea, BorderLayout.CENTER);

        JScrollPane scrollPane = new JScrollPane(messageArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton submit = new JButton("SUBMIT");
        bottom.add(inputField);
        bottom.add(submit);
        panel.add(bottom, BorderLayout.SOUTH);

        InputListener submitButton = new InputListener(inputField, messageArea);
        inputField.addActionListener(submitButton);
        submit.addActionListener(submitButton);

    }

    public JPanel getPanel() {
        return panel;
    }

}

