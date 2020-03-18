package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoronaTest extends Gui implements ActionListener {


    JPanel corona, backbutton;
    JLabel tester;
    JButton back;

    public CoronaTest() {
        setTitle("COVID-19 Result");
        corona = new JPanel(new BorderLayout());
        add(corona);
        setSize(400,200);
        tester = new JLabel("You have tested "+"For Corona");
        backbutton=new JPanel(new FlowLayout());
        corona.add(tester);




        back = new JButton("Back");
        back.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        back.setSize(50,50);
        back.addActionListener(this);
        backbutton.add(back);


        getContentPane().add(corona, BorderLayout.NORTH);
        getContentPane().add(backbutton, BorderLayout.SOUTH);



        tester.setBorder(BorderFactory.createEmptyBorder(50, 125, 10, 0));


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        User_Input test = new User_Input();
        hide();
    }
}
