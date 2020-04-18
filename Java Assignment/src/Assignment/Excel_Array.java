package Assignment;


import org.w3c.dom.Node;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Excel_Array {


    boolean temperatureNo,AcheNo,CoughNo,SoreThroatNo,RecentlytraveledNo;
    boolean temperatureYes,AcheYes,CoughYes,SoreThroatYes,RecentlytraveledYes;
    double Negative_Result,Positive_Result;
    float total;
   double corona;
    Excel_Sheet records = new Excel_Sheet();
    List<List<String>> rec = records.Excel_Sheet();


    public static void main(String[] args) {
        Excel_Array test = new Excel_Array();
        test.result();
        //System.out.println(records.Excel_Sheet());

    }

    public void result(){
        /*ache();
        sore();
        cough();
        temperature();
        travel();*/


        // P(A|B) =(P(B|A) * P((A))/P(B)
        HashMap<String, String>CoronaVirus = new HashMap<>();

        HashMap<String, Integer> tempPos = new HashMap<>();
        tempPos.put("hot",0);
        tempPos.put("cold",0);
        tempPos.put("normal",0);
        tempPos.put("cool",0);

        HashMap<String, Integer> tempNeg = new HashMap<>();
        tempNeg.put("hot",0);
        tempNeg.put("cold",0);
        tempNeg.put("normal",0);
        tempNeg.put("cool",0);

        HashMap<String, Integer> achePos = new HashMap<>();
        achePos.put("yes",0);
        achePos.put("no",0);
        HashMap<String, Integer> acheNeg = new HashMap<>();
        acheNeg.put("no",0);
        acheNeg.put("yes",0);

        HashMap<String, Integer> coughPos = new HashMap<>();
        coughPos.put("yes",0);
        coughPos.put("no",0);

        HashMap<String, Integer> coughNeg = new HashMap<>();
        coughNeg.put("no",0);
        coughNeg.put("yes",0);

        HashMap<String, Integer> sorePos = new HashMap<>();
        sorePos.put("yes",0);
        sorePos.put("no",0);
        HashMap<String, Integer> soreNeg = new HashMap<>();
        soreNeg.put("no",0);
        soreNeg.put("yes",0);

        HashMap<String, Integer> recentlyPos = new HashMap<>();
        recentlyPos.put("yes",0);
        recentlyPos.put("no",0);
        HashMap<String, Integer> recentlyNeg = new HashMap<>();
        recentlyNeg.put("no",0);
        recentlyNeg.put("yes",0);

        HashMap<String, Integer> covid19Pos = new HashMap<>();
        covid19Pos.put("yes",0);
        covid19Pos.put("no",0);
        HashMap<String, Integer> covid19Neg = new HashMap<>();
        covid19Neg.put("no",0);
        covid19Neg.put("yes",0);


        for(int i = 1; i < rec.size(); i++)
        {
            Object array[] = rec.get(i).toArray();
            // Temp Positive
            if(array[0].equals("hot") && array[5].equals("yes"))
            {
                tempPos.put("hot",tempPos.get("hot")+1);
            }
            if(array[0].equals("cold") && array[5].equals("yes"))
            {
                tempPos.put("cold",tempPos.get("cold")+1);
            }
            if(array[0].equals("normal") && array[5].equals("yes"))
            {
                tempPos.put("normal",tempPos.get("normal")+1);
            }
            if(array[0].equals("cool") && array[5].equals("yes"))
            {
                tempPos.put("cool",tempPos.get("cool")+1);
            }

            //Temp Negative
            if(array[0].equals("hot") && array[5].equals("no"))
            {
                tempNeg.put("hot",tempNeg.get("hot")+1);
            }
            if(array[0].equals("cold") && array[5].equals("no"))
            {
                tempNeg.put("cold",tempNeg.get("cold")+1);
            }
            if(array[0].equals("normal") && array[5].equals("no"))
            {
                tempNeg.put("normal",tempNeg.get("normal")+1);
            }
            if(array[0].equals("cool") && array[5].equals("no"))
            {
                tempNeg.put("cool",tempNeg.get("cool")+1);
            }
            //Ache Positive
            if(array[1].equals("yes") && array[5].equals("yes"))
            {
                achePos.put("yes",achePos.get("yes")+1);
            }

            //Ache Negative
            if(array[1].equals("no") && array[5].equals("no"))
            {
                acheNeg.put("no",acheNeg.get("no")+1);
            }

            //Cough Positive
            if(array[2].equals("yes") && array[5].equals("yes"))
            {
                coughPos.put("yes",coughPos.get("yes")+1);
            }
            //Cough Negative
            if(array[2].equals("no") && array[5].equals("no"))
            {
                coughNeg.put("no",coughNeg.get("no")+1);
            }
            //Sore Throat Positive
            if(array[3].equals("yes") && array[5].equals("yes"))
            {
                sorePos.put("yes",sorePos.get("yes")+1);
            }
            //Sore Throat Negative
            if(array[3].equals("no") && array[5].equals("no"))
            {
                soreNeg.put("no",soreNeg.get("no")+1);
            }
            //Recently Positive
            if(array[4].equals("yes") && array[5].equals("yes"))
            {
                recentlyPos.put("yes",recentlyPos.get("yes")+1);
            }
            //Recently Negative
            if(array[4].equals("no") && array[5].equals("no"))
            {
                recentlyNeg.put("no",recentlyNeg.get("no")+1);
            }
            //Recently Positive
            if(array[5].equals("yes") && array[5].equals("yes"))
            {
                covid19Pos.put("yes",covid19Pos.get("yes")+1);
            }
            //Recently Negative
            if(array[5].equals("no") && array[5].equals("no"))
            {
                covid19Neg.put("no",covid19Neg.get("no")+1);
            }


        }
        //Positive print
        System.out.println("Positive Values for Temperature");
        System.out.println(tempPos.get("hot"));
        System.out.println(tempPos.get("cold"));
        System.out.println(tempPos.get("normal"));
        System.out.println(tempPos.get("cool"));

        //Negative print
        System.out.println("Negative Values for Temperature");
        System.out.println(tempNeg.get("hot"));
        System.out.println(tempNeg.get("cold"));
        System.out.println(tempNeg.get("normal"));
        System.out.println(tempNeg.get("cool"));

        System.out.println("Negative Values for Temperature");
        System.out.println(tempNeg.get("hot"));
        System.out.println(tempNeg.get("cold"));

        System.out.println("Positive Values for Aches");
        System.out.println(achePos.get("yes"));
        System.out.println("Negative Values for Aches");
        System.out.println(acheNeg.get("no"));

        System.out.println("Positive Values for Cough");
        System.out.println(coughPos.get("yes"));
        System.out.println("Negative Values for Cough");
        System.out.println(coughNeg.get("no"));

        System.out.println("Positive Values for Sore Throat");
        System.out.println(sorePos.get("yes"));
        System.out.println("Negative Values for Sore Throat");
        System.out.println(soreNeg.get("no"));

        System.out.println("Positive Values for Recently Traveled");
        System.out.println(recentlyPos.get("yes"));
        System.out.println("Negative Values for Recently Traveled");
        System.out.println(recentlyNeg.get("no"));

        System.out.println("Positive Values for Having Covid-19");
        System.out.println(covid19Pos.get("yes"));
        System.out.println("Negative Values for Having Covid-19");
        System.out.println(covid19Neg.get("no"));

    }
    public double probability (Map.Entry User_Input){
        /*total = corona.get(false);
        Negative_Result = TemperatureNo.get(User_Input.getTemp())/total;
        Negative_Result *= AcheNo.get(User_Input.getAche())/total;
        Negative_Result *= CoughNo.get(CoronaTest.getCough())/total;
        Negative_Result *= SoreThroatNo.get(CoronaTest.getSoreThorat())/total;
        Negative_Result *= RecentlytraveledNo.get(CoronaTest.getRecentlyTravled())/total;
        Negative_Result *= (float) corona.get(false) / CoronaTest;


        total=corona.get(true);
        Positive_Result *= TemperatureYes.get(CoronaTest.getAche())/total;
        Positive_Result *= AcheYes.get(CoronaTest.getAche())/total;
        Positive_Result *= CoughYes.get(CoronaTest.getCough())/total;
        Positive_Result *= SoreThroatYes.get(CoronaTest.getSoreThorat())/total;
        Positive_Result *= RecentlytraveledYes.get(CoronaTest.getRecentlyTraveled())/total;
        Positive_Result *= (float) corona.get(false) / CoronaTest;*/



        return Positive_Result / (Positive_Result + Negative_Result) * 100;

    }
}

