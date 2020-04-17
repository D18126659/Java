package Assignment;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    private Dimension dim;

    public Gui() {
        //super("COVID-19");
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        int x = dim.width / 2 - getWidth() / 2;
        int y = dim.height / 2 - getHeight() / 2;
        setLocation(x, y);
        setResizable(false);
        setVisible(true);
    }
}