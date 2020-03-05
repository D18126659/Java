package guis;
import javax.swing.*;
import java.awt.*;

public class Guis extends JFrame {

    JLabel label1;
    JButton button1;


    public Guis(String MyTitle) {

        super(MyTitle);
        setSize(300, 300);
        label1 = new JLabel("Java Screen building");
        button1 = new JButton("Click me");
        add(label1);
        add(button1);
        setVisible(true);

    }
}
