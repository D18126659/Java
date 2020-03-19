package Assignment;

import com.sun.tools.javac.Main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User_Input extends Gui implements ActionListener{

    private JPanel mainPanel;
    private JLabel title, temp, ache, travel, cough, sore;
    private JButton button;
    private JRadioButton temperatureNormal, temperatureCool, temperatureHot, achesYes, achesNo, coughYes, coughNo, soreThroatYes,
            soreThroatNo, RecentlytraveledYes, RecentlytraveledNo;

    public User_Input()
    {
        panels();
        titles();
        temperature();
        ache();
        cough();
        sore();
        travel();
        button();
    }

    public void panels()
    {
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        add(mainPanel);
    }

    public void titles()
    {
        setTitle("COVID-19");
        title = new JLabel("Please answer the following questions:");
        title.setFont(new Font(null,Font.BOLD,14));
        title.setBounds(60,0,300,50);
        mainPanel.add(title);
    }

    public void temperature()
    {
        temp = new JLabel("What is your temperature?");
        mainPanel.add(temp);

        temperatureNormal = new JRadioButton("Normal");
        temperatureCool = new JRadioButton("Cool");
        temperatureHot = new JRadioButton("Hot");

        ButtonGroup temperature = new ButtonGroup();
        temperature.add(temperatureNormal);
        temperature.add(temperatureCool);
        temperature.add(temperatureHot);

        mainPanel.add(temperatureNormal);
        mainPanel.add(temperatureCool);
        mainPanel.add(temperatureHot);

        temp.setBounds(115,60,150,20);
        temperatureNormal.setBounds(150,90,150,20);
        temperatureCool.setBounds(150,115,150,20);
        temperatureHot.setBounds(150,140,150,20);
    }

    private void ache()
    {
        ache = new JLabel("Have you been Aching a lot?");
        achesYes = new JRadioButton("Yes");
        achesNo = new JRadioButton("No");
        mainPanel.add(ache);

        ButtonGroup aches = new ButtonGroup();
        aches.add(achesYes);
        aches.add(achesNo);
        mainPanel.add(achesYes);
        mainPanel.add(achesNo);

        ache.setBounds(110,170,170,20);
        achesYes.setBounds(150,200,170,20);
        achesNo.setBounds(150,225,170,20);
    }

    public void cough()
    {
        cough = new JLabel("Have you been coughing a lot?");
        coughYes = new JRadioButton("Yes");
        coughNo = new JRadioButton("No");
        mainPanel.add(cough);

        ButtonGroup coughs = new ButtonGroup();
        coughs.add(coughYes);
        coughs.add(coughNo);
        mainPanel.add(coughYes);
        mainPanel.add(coughNo);

        cough.setBounds(100,255,180,20);
        coughYes.setBounds(150,285,170,20);
        coughNo.setBounds(150,310,170,20);
    }

    public void sore()
    {
        sore = new JLabel("Do you have a sore throat?");
        soreThroatYes = new JRadioButton("Yes");
        soreThroatNo = new JRadioButton("No");
        mainPanel.add(sore);

        ButtonGroup sores = new ButtonGroup();
        sores.add(soreThroatYes);
        sores.add(soreThroatNo);
        mainPanel.add(soreThroatYes);
        mainPanel.add(soreThroatNo);

        sore.setBounds(110,340,180,20);
        soreThroatYes.setBounds(150,370,170,20);
        soreThroatNo.setBounds(150,395,170,20);
    }

    public void travel()
    {
        travel = new JLabel("Have you recently traveled?");
        RecentlytraveledYes = new JRadioButton("Yes");
        RecentlytraveledNo = new JRadioButton("No");
        mainPanel.add(travel);

        ButtonGroup travels = new ButtonGroup();
        travels.add(RecentlytraveledYes);
        travels.add(RecentlytraveledNo);
        mainPanel.add(RecentlytraveledYes);
        mainPanel.add(RecentlytraveledNo);

        travel.setBounds(110,425,180,20);
        RecentlytraveledYes.setBounds(150,455,170,20);
        RecentlytraveledNo.setBounds(150,480,170,20);
    }

    public void button()
    {
        button = new JButton("Test");
        button.addActionListener(this);
        mainPanel.add(button);

        button.setBounds(130,530,100,20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(!(temperatureCool.isSelected() || temperatureHot.isSelected() || temperatureNormal.isSelected()) ||
                !(achesYes.isSelected() || achesNo.isSelected()) || !(coughYes.isSelected() || coughNo.isSelected()) ||
                !(soreThroatYes.isSelected() || soreThroatNo.isSelected()) || !(RecentlytraveledNo.isSelected() || RecentlytraveledYes.isSelected()))
            JOptionPane.showMessageDialog(null, "Error - You have to select all valid buttons", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            CoronaTest Test = new CoronaTest();
            hide();
        }
    }
}