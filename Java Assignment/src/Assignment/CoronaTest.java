package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CoronaTest extends Gui implements ActionListener {


    JPanel corona, backbutton;
    JLabel tester;
    JButton back;
    String arr1[]= new String[5];


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

        arr1=User_Input.arr1;

        Excel_Sheet records = new Excel_Sheet();
        //<List<String>> arr2 = records.Excel_Sheet();
            //arr2.add();
           // arr2.add(Excel_Sheet);

        for(int i=0;i<5;i++){
            System.out.println(arr1[i]);
        }

        /*for (int row = 0; row < records.length; row++) {
            for (int col = 0; col < records[row].length; col++) {
                records[row][col] = row * col;
            }
        }*/


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        User_Input test = new User_Input();
        hide();
    }
}
