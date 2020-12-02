import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        setTitle("Chat");
        setBounds(100, 100, 500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel top = new TopFrame().getPanel();
        JPanel centre = new CentreFrame().getPanel();

        add(top, BorderLayout.NORTH);
        add(centre, BorderLayout.CENTER);

        setVisible(true);
    }
}
