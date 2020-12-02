import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopFrame {
    private JPanel panel;

    public TopFrame() {
        this.panel = new JPanel();
        init();
    }

    public void init() {
        panel.setBackground(new Color(150, 150, 150));
        panel.setLayout(new GridLayout(1, 2));
        panel.add(initMenuBar());

    }

    public JMenuBar initMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(100, 150, 255));
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem newChat = new JMenuItem("New chat");
        fileMenu.add(newChat);
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ExitChat());
        fileMenu.add(exit);

        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);
        JMenuItem cut = new JMenuItem("Cut");
        editMenu.add(cut);
        JMenuItem copy = new JMenuItem("Copy");
        editMenu.add(copy);
        JMenuItem paste = new JMenuItem("Paste");
        editMenu.add(paste);

        JMenu aboutMenu = new JMenu("About program");
        menuBar.add(aboutMenu);
        JMenuItem about = new JMenuItem("There is nothing yet..");
        editMenu.add(about);

        return menuBar;
    }

    public JPanel getPanel() {
        return panel;
    }

    public static class ExitChat implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

}
