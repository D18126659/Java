package Assignment;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Flow;


public class User_Input extends Gui implements ActionListener {
    private JPanel application, buttonlayout;
    private JLabel temp, ache, travel, cough, sore;
    private JButton button;



    public User_Input() {


        setTitle("COVID-19");
        application = new JPanel(new BorderLayout());

        buttonlayout=new JPanel(new FlowLayout());

        temp = new JLabel("What is your temperature?");
        JRadioButton temperatureNormal = new JRadioButton("Normal");
        JRadioButton temperatureCool = new JRadioButton("Cool");
        JRadioButton temperatureHot = new JRadioButton("Hot");
        application.add(temp);

        ButtonGroup temperature = new ButtonGroup();
        temperature.add(temperatureNormal);
        temperature.add(temperatureCool);
        temperature.add(temperatureHot);
        application.add(temperatureNormal);
        application.add(temperatureCool);
        application.add(temperatureHot);


        ache = new JLabel("Have you been Aching a lot?");
        JRadioButton achesYes = new JRadioButton("Yes");
        JRadioButton achesNo = new JRadioButton("No");
        application.add(ache);

        ButtonGroup aches = new ButtonGroup();
        aches.add(achesYes);
        aches.add(achesNo);
        application.add(achesYes);
        application.add(achesNo);

        cough = new JLabel("Have you been coughing a lot?");
        JRadioButton coughYes = new JRadioButton("Yes");
        JRadioButton coughNo = new JRadioButton("No");
        application.add(cough);

        ButtonGroup coughs = new ButtonGroup();
        coughs.add(achesYes);
        coughs.add(achesNo);
        application.add(coughYes);
        application.add(coughNo);


        sore = new JLabel("Do you have a sore throat?");
        JRadioButton soreThroatYes = new JRadioButton("Yes");
        JRadioButton soreThroatNo = new JRadioButton("No");
        application.add(sore);

        ButtonGroup sores = new ButtonGroup();
        sores.add(achesYes);
        sores.add(achesNo);
        application.add(soreThroatYes);
        application.add(soreThroatNo);


        travel = new JLabel("Have you recently traveled?");
        JRadioButton RecentlytraveledYes = new JRadioButton("Yes");
        JRadioButton RecentlytraveledNo = new JRadioButton("No");
        application.add(travel);


        ButtonGroup travels = new ButtonGroup();
        travels.add(achesYes);
        travels.add(achesNo);
        application.add(RecentlytraveledYes);
        application.add(RecentlytraveledNo);

        button = new JButton("Test");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setSize(50,50);
        buttonlayout.add(button);
        button.addActionListener(this);
        add(application);

        application.setLayout(new BoxLayout(application, BoxLayout.Y_AXIS));
        application.setBorder(BorderFactory.createTitledBorder("Corona Test"));

        temp.setBorder(BorderFactory.createEmptyBorder(20, 75, 10, 0));
        temperatureCool.setBorder(BorderFactory.createEmptyBorder(0, 125, 0, 50));
        temperatureHot.setBorder(BorderFactory.createEmptyBorder(0, 125, 0, 50));
        temperatureNormal.setBorder(BorderFactory.createEmptyBorder(0, 125, 0, 50));

        ache.setBorder(BorderFactory.createEmptyBorder(20, 75, 10, 0));
        achesYes.setBorder(BorderFactory.createEmptyBorder(0, 125, 0, 50));
        achesNo.setBorder(BorderFactory.createEmptyBorder(0, 125, 0, 50));

        cough.setBorder(BorderFactory.createEmptyBorder(20, 75, 10, 0));
        coughYes.setBorder(BorderFactory.createEmptyBorder(0, 125, 0, 50));
        coughNo.setBorder(BorderFactory.createEmptyBorder(0, 125, 0, 50));

        sore.setBorder(BorderFactory.createEmptyBorder(20, 75, 10, 0));
        soreThroatYes.setBorder(BorderFactory.createEmptyBorder(0, 125, 0, 50));
        soreThroatNo.setBorder(BorderFactory.createEmptyBorder(0, 125, 0, 50));


        travel.setBorder(BorderFactory.createEmptyBorder(20, 75, 10, 0));
        RecentlytraveledYes.setBorder(BorderFactory.createEmptyBorder(0, 125, 0, 50));
        RecentlytraveledNo.setBorder(BorderFactory.createEmptyBorder(0, 125, 10, 50));

        application.add(buttonlayout);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        CoronaTest Test = new CoronaTest();
        hide();
    }

}
