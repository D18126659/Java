package Assignment;


import org.w3c.dom.Node;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Excel_Array {


    //boolean temperatureNo,AcheNo,CoughNo,SoreThroatNo,RecentlytraveledNo;
    //boolean temperatureYes,AcheYes,CoughYes,SoreThroatYes,RecentlytraveledYes;
    //double Negative_Result,Positive_Result;
    double tempHotPosYes,tempHotPosNo,tempHotNegYes,tempHotNegNo,tempNormalPosYes,tempNormalPosNo
            ,tempNormalNegYes,tempNormalNegNo,tempCoolPosYes,tempCoolPosNo,tempCoolNegYes,
            tempCoolNegNo,tempColdPosYes,tempColdPosNo,tempColdNegYes,tempColdNegNo
            , achePosYes, achePosNo, acheNegYes, acheNegNo,
            coughPosYes,coughPosNo,coughNegYes,coughNegNo,
            sorePosYes, sorePosNo,soreNegYes,soreNegNo,
            recentlyPosYes,recentlyPosNo, recentlyNegYes,recentlyNegNo,
            covid19PosYes,covid19PosNo,covidNegYes,covid19NegNo;
    Excel_Sheet records = new Excel_Sheet();
    double total = records.Excel_Sheet().size();
    double corona;
    int counter=0;
    List<List<String>> rec = records.Excel_Sheet();
    //HashMap<String, String>CoronaVirus = new HashMap<>();
    private HashMap<String, Double> tempPos = new HashMap<>();
    private HashMap<String, Integer> tempNeg = new HashMap<>();
    private HashMap<String, Integer> achePos = new HashMap<>();
    private HashMap<String, Integer> acheNeg = new HashMap<>();
    private HashMap<String, Integer> coughPos = new HashMap<>();
    private HashMap<String, Integer> coughNeg = new HashMap<>();
    private HashMap<String, Integer> sorePos = new HashMap<>();
    private HashMap<String, Integer> soreNeg = new HashMap<>();
    private HashMap<String, Integer> recentlyPos = new HashMap<>();
    private HashMap<String, Integer> recentlyNeg = new HashMap<>();
    private HashMap<String, Integer> covid19Pos = new HashMap<>();
    private HashMap<String, Integer> covid19Neg = new HashMap<>();



    public static void main(String[] args) {
        Excel_Array test = new Excel_Array();
        test.setHashMaps();
        test.hashMapValues();
        test.probability();

    }

    public void setHashMaps()
    {
        tempPos.put("hot",0.0);
        tempPos.put("cold",0.0);
        tempPos.put("normal",0.0);
        tempPos.put("cool",0.0);

        tempNeg.put("hot",0);
        tempNeg.put("cold",0);
        tempNeg.put("normal",0);
        tempNeg.put("cool",0);

        achePos.put("yes",0);
        achePos.put("no",0);

        acheNeg.put("no",0);
        acheNeg.put("yes",0);

        coughPos.put("yes",0);
        coughPos.put("no",0);

        coughNeg.put("no",0);
        coughNeg.put("yes",0);

        sorePos.put("yes",0);
        sorePos.put("no",0);

        soreNeg.put("no",0);
        soreNeg.put("yes",0);

        recentlyPos.put("yes",0);
        recentlyPos.put("no",0);

        recentlyNeg.put("no",0);
        recentlyNeg.put("yes",0);

        covid19Pos.put("yes",0);
        covid19Pos.put("no",0);

        covid19Neg.put("no",0);
        covid19Neg.put("yes",0);
    }

    public void hashMapValues(){
        // P(A|B) =(P(B|A) * P((A))/P(B)

        for(int i = 1; i < rec.size(); i++)
        {
            counter++;
            Object array[] = rec.get(i).toArray();
            //Temp Positive
            // Temp hot
            if(array[0].equals("hot") && array[5].equals("yes"))
            {
                tempPos.put("hot",tempPos.get("hot")+1);
            }
            if(array[0].equals("hot") && array[5].equals("no"))
            {
                tempPos.put("hot",tempPos.get("hot")+1);
            //temp Cold
            }
            if(array[0].equals("cold") && array[5].equals("yes"))
            {
                tempPos.put("cold",tempPos.get("cold")+1);
            }
            if(array[0].equals("cold") && array[5].equals("no"))
            {
                tempPos.put("cold",tempPos.get("cold")+1);
            }
            //temp Normal
            if(array[0].equals("normal") && array[5].equals("yes"))
            {
                tempPos.put("normal",tempPos.get("normal")+1);
            }
            if(array[0].equals("normal") && array[5].equals("no"))
            {
                tempPos.put("normal",tempPos.get("normal")+1);
            }
            //Temp Cool
            if(array[0].equals("cool") && array[5].equals("yes"))
            {
                tempPos.put("cool",tempPos.get("cool")+1);
            }
            if(array[0].equals("cool") && array[5].equals("no"))
            {
                tempPos.put("cool",tempPos.get("cool")+1);
            }

            //Temp Negative
            //Temp Hot
            if(array[0].equals("hot") && array[5].equals("no"))
            {
                tempNeg.put("hot",tempNeg.get("hot")+1);
            }
            if(array[0].equals("hot") && array[5].equals("yes"))
            {
                tempNeg.put("hot",tempNeg.get("hot")+1);
            }
            //temp cold
            if(array[0].equals("cold") && array[5].equals("no"))
            {
                tempNeg.put("cold",tempNeg.get("cold")+1);
            }
            if(array[0].equals("cold") && array[5].equals("yes"))
            {
                tempNeg.put("cold",tempNeg.get("cold")+1);
            }
            //Temp normal;
            if(array[0].equals("normal") && array[5].equals("no"))
            {
                tempNeg.put("normal",tempNeg.get("normal")+1);
            }
            if(array[0].equals("normal") && array[5].equals("yes"))
            {
                tempNeg.put("normal",tempNeg.get("normal")+1);
            }
            //Temp cool
            if(array[0].equals("cool") && array[5].equals("no"))
            {
                tempNeg.put("cool",tempNeg.get("cool")+1);
            }
            if(array[0].equals("cool") && array[5].equals("yes"))
            {
                tempNeg.put("cool",tempNeg.get("cool")+1);
            }

            //Ache Positive
            if(array[1].equals("yes") && array[5].equals("yes"))
            {
                achePos.put("yes",achePos.get("yes")+1);
            }
            if(array[1].equals("no") && array[5].equals("yes"))
            {
                achePos.put("no",achePos.get("no")+1);
            }

            //Ache Negative
            if(array[1].equals("no") && array[5].equals("no"))
            {
                acheNeg.put("no",acheNeg.get("no")+1);
            }
            if(array[1].equals("yes") && array[5].equals("no"))
            {
                acheNeg.put("yes",acheNeg.get("yes")+1);
            }

            //Cough Positive
            if(array[2].equals("yes") && array[5].equals("yes"))
            {
                coughPos.put("yes",coughPos.get("yes")+1);
            }
            if(array[2].equals("no") && array[5].equals("yes"))
            {
                coughPos.put("no",coughPos.get("no")+1);
            }

            //Cough Negative
            if(array[2].equals("no") && array[5].equals("no"))
            {
                coughNeg.put("no",coughNeg.get("no")+1);
            }
            if(array[2].equals("yes") && array[5].equals("no"))
            {
                coughNeg.put("yes",coughNeg.get("yes")+1);
            }

            //Sore Throat Positive
            if(array[3].equals("yes") && array[5].equals("yes"))
            {
                sorePos.put("yes",sorePos.get("yes")+1);
            }
            if(array[3].equals("no") && array[5].equals("yes"))
            {
                sorePos.put("no",sorePos.get("no")+1);
            }

            //Sore Throat Negative
            if(array[3].equals("no") && array[5].equals("no"))
            {
                soreNeg.put("no",soreNeg.get("no")+1);
            }
            if(array[3].equals("yes") && array[5].equals("no"))
            {
                soreNeg.put("yes",soreNeg.get("yes")+1);
            }

            //Recently Positive
            if(array[4].equals("yes") && array[5].equals("yes"))
            {
                recentlyPos.put("yes",recentlyPos.get("yes")+1);
            }
            if(array[4].equals("no") && array[5].equals("yes"))
            {
                recentlyPos.put("no",recentlyPos.get("no")+1);
            }

            //Recently Negative
            if(array[4].equals("no") && array[5].equals("no"))
            {
                recentlyNeg.put("no",recentlyNeg.get("no")+1);
            }
            if(array[4].equals("yes") && array[5].equals("no"))
            {
                recentlyNeg.put("yes",recentlyNeg.get("yes")+1);
            }
            //Covid_19 Positive
            if(array[5].equals("yes") && array[5].equals("yes"))
            {
                covid19Pos.put("yes",covid19Pos.get("yes")+1);
            }
            if(array[5].equals("no") && array[5].equals("yes"))
            {
                covid19Pos.put("no",covid19Pos.get("no")+1);
            }
            //Covid_19 Negative
            if(array[5].equals("no") && array[5].equals("no"))
            {
                covid19Neg.put("no",covid19Neg.get("no")+1);
            }
            if(array[5].equals("yes") && array[5].equals("no"))
            {
                covid19Neg.put("yes",covid19Neg.get("yes")+1);
            }
        }
        /*System.out.println(achePos.get("yes"));
        System.out.println(achePos.get("no"));
        System.out.println(acheNeg.get("yes"));
        System.out.println(acheNeg.get("no"));*/

    }

    public void probability (){

        //Temp Hot Pos
       // tempPos.put("hot",tempPos.get("yes")/total);
        //tempHotPosYes = tempPos.get("yes")/total;
        /*tempHotPosNo = tempPos.get("no")/total;

        //Temp Hot Neg
        tempHotNegYes = tempNeg.get("yes")/total;
        tempHotNegNo = tempNeg.get("no")/total;

        //Temp normal Pos
        tempNormalPosYes = tempPos.get("yes")/total;
        tempNormalPosNo = tempPos.get("no")/total;

        //Temp normal Neg
        tempNormalNegYes = tempNeg.get("yes")/total;
        tempNormalNegNo = tempNeg.get("no")/total;

        //Temp Cool Pos
        tempCoolPosYes = tempPos.get("yes")/total;
        tempCoolPosNo = tempPos.get("no")/total;

        //Temp cool Neg
        tempCoolNegYes = tempNeg.get("yes")/total;
        tempCoolNegNo = tempNeg.get("no")/total;

        //Temp Cold Pos
        tempColdPosYes = tempPos.get("yes")/total;
        tempColdPosNo = tempPos.get("no")/total;

        //Temp Cold Neg
        tempColdNegYes = tempNeg.get("yes")/total;
        tempColdNegNo = tempNeg.get("no")/total;
                                                */


        //Ache Pos
        achePosYes = achePos.get("yes")/total;
        achePosNo = achePos.get("no")/total;

        //Ache Neg
        acheNegYes = acheNeg.get("yes")/total;
        acheNegNo = acheNeg.get("no")/total;

        //Cough Pos
        coughPosYes = coughPos.get("yes")/total;
        coughPosNo = coughPos.get("no")/total;

        //Cough Neg
        coughNegYes = coughNeg.get("yes")/total;
        coughNegNo = coughNeg.get("no")/total;

        //sore Pos
        sorePosYes = sorePos.get("yes")/total;
        sorePosNo = sorePos.get("no")/total;

        //sore Neg
        soreNegYes = soreNeg.get("yes")/total;
        soreNegNo = soreNeg.get("no")/total;

        //Recently Pos
        recentlyPosYes = recentlyPos.get("yes")/total;
        recentlyPosNo = recentlyPos.get("no")/total;

        //Recently Neg
        recentlyNegYes = recentlyNeg.get("yes")/total;
        recentlyNegNo = recentlyNeg.get("no")/total;

        //Covid Pos
        covid19PosYes = covid19Pos.get("yes")/total;
        covid19PosNo = covid19Pos.get("no")/total;

        //Covid Neg
        covidNegYes = covid19Neg.get("yes")/total;
        covid19NegNo = covid19Neg.get("no")/total;


       // System.out.println(tempPos.get("hot"));
        //System.out.println(tempPos.get("yes")/total);
        System.out.println("cough");
        System.out.println(coughPos.get("yes") + coughPos.get("no") + coughNeg.get("yes") + coughNeg.get("no"));

        System.out.println("covid_19");
        System.out.println(covid19Pos.get("yes") + covid19Pos.get("no") + covid19Neg.get("yes") + covid19Neg.get("no"));

        System.out.println("Ache");
        System.out.println(achePos.get("yes") + achePos.get("no") + acheNeg.get("yes") + acheNeg.get("no"));

        System.out.println("Sore throat");
        System.out.println(sorePos.get("yes") + sorePos.get("no") + soreNeg.get("yes") + soreNeg.get("no"));

        System.out.println("Recently Traveled");
        System.out.println(recentlyPos.get("yes") + recentlyPos.get("no") + recentlyNeg.get("yes") + recentlyNeg.get("no"));


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



       // return Positive_Result / (Positive_Result + Negative_Result) * 100;

    }
}

