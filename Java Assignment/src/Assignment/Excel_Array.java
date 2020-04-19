package Assignment;

import java.util.HashMap;
import java.util.List;
import java.text.DecimalFormat;


public class Excel_Array {

    Excel_Sheet records = new Excel_Sheet();
    double total = records.Excel_Sheet().size();
    int counter=0;
    List<List<String>> rec = records.Excel_Sheet();
    private HashMap<String, Double> tempPos = new HashMap<>();
    private HashMap<String, Double> tempNeg = new HashMap<>();
    private HashMap<String, Double> achePos = new HashMap<>();
    private HashMap<String, Double> acheNeg = new HashMap<>();
    private HashMap<String, Double> coughPos = new HashMap<>();
    private HashMap<String, Double> coughNeg = new HashMap<>();
    private HashMap<String, Double> sorePos = new HashMap<>();
    private HashMap<String, Double> soreNeg = new HashMap<>();
    private HashMap<String, Double> recentlyPos = new HashMap<>();
    private HashMap<String, Double> recentlyNeg = new HashMap<>();
    private HashMap<String, Double> covid19 = new HashMap<>();




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

        tempNeg.put("hot",0.0);
        tempNeg.put("cold",0.0);
        tempNeg.put("normal",0.0);
        tempNeg.put("cool",0.0);

        achePos.put("yes",0.0);
        achePos.put("no",0.0);

        acheNeg.put("no",0.0);
        acheNeg.put("yes",0.0);

        coughPos.put("yes",0.0);
        coughPos.put("no",0.0);

        coughNeg.put("no",0.0);
        coughNeg.put("yes",0.0);

        sorePos.put("yes",0.0);
        sorePos.put("no",0.0);

        soreNeg.put("no",0.0);
        soreNeg.put("yes",0.0);

        recentlyPos.put("yes",0.0);
        recentlyPos.put("no",0.0);

        recentlyNeg.put("no",0.0);
        recentlyNeg.put("yes",0.0);

        covid19.put("yes",0.0);
        covid19.put("no",0.0);

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

            if(array[0].equals("cold") && array[5].equals("yes"))
            {
                tempPos.put("cold",tempPos.get("cold")+1);
            }

            //temp Normal
            if(array[0].equals("normal") && array[5].equals("yes"))
            {
                tempPos.put("normal",tempPos.get("normal")+1);
            }

            //Temp Cool
            if(array[0].equals("cool") && array[5].equals("yes"))
            {
                tempPos.put("cool",tempPos.get("cool")+1);
            }

            //Temp Negative
            //Temp Hot
            if(array[0].equals("hot") && array[5].equals("no"))
            {
                tempNeg.put("hot",tempNeg.get("hot")+1);
            }

            //temp cold
            if(array[0].equals("cold") && array[5].equals("no"))
            {
                tempNeg.put("cold",tempNeg.get("cold")+1);
            }

            //Temp normal;
            if(array[0].equals("normal") && array[5].equals("no"))
            {
                tempNeg.put("normal",tempNeg.get("normal")+1);
            }

            //Temp cool
            if(array[0].equals("cool") && array[5].equals("no"))
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
            //Covid 19
            if(array[5].equals("yes"))
            {
                covid19.put("yes",covid19.get("yes")+1);
            }
            if(array[5].equals("no"))
            {
                covid19.put("no",covid19.get("no")+1);
            }

        }

    }

    public void probability () {

        //Temp Hot Pos
        tempPos.put("hot", tempPos.get("hot") / total);

        //Temp Hot Neg
        tempNeg.put("hot", tempNeg.get("hot") / total);

        //Temp normal Pos
        tempPos.put("normal", tempPos.get("normal") / total);

        //Temp normal Neg
        tempNeg.put("normal", tempNeg.get("normal") / total);

        //Temp Cool Pos
        tempPos.put("cool", tempPos.get("cool") / total);

        //Temp cool Neg
        tempNeg.put("cool", tempNeg.get("cool") / total);

        //Temp Cold Pos
        tempPos.put("cold", tempPos.get("cold") / total);

        //Temp Cold Neg
        tempNeg.put("cold", tempNeg.get("cold") / total);


        //Ache Pos
        achePos.put("yes", achePos.get("yes") / total);
        achePos.put("no", achePos.get("no") / total);


        //Ache Neg
        acheNeg.put("yes", acheNeg.get("yes") / total);
        acheNeg.put("no", acheNeg.get("no") / total);


        //Cough Pos
        coughPos.put("yes", coughPos.get("yes") / total);
        coughPos.put("no", coughPos.get("no") / total);

        //Cough Neg
        coughNeg.put("no", coughNeg.get("no") / total);
        coughNeg.put("yes", coughNeg.get("yes") / total);

        //sore Pos
        sorePos.put("yes", sorePos.get("yes") / total);
        sorePos.put("no", sorePos.get("no") / total);

        //sore Neg
        soreNeg.put("no", soreNeg.get("no") / total);
        soreNeg.put("yes", soreNeg.get("yes") / total);

        //Recently Pos
        recentlyPos.put("yes", recentlyPos.get("yes") / total);
        recentlyPos.put("no", recentlyPos.get("no") / total);

        //Recently Neg
        recentlyNeg.put("no", recentlyNeg.get("no") / total);
        recentlyNeg.put("yes", recentlyNeg.get("yes") / total);

        //Covid Pos
        covid19.put("yes", covid19.get("yes") / total);

        //Covid Neg
        covid19.put("no", covid19.get("no") / total);

    }

    public void results(String[] userInput){
        setHashMaps();
        hashMapValues();
        probability();
        double positive = 1,negative = 1;

        for(int i = 0; i < userInput.length; i++)
        {
            System.out.println(i + "  " + userInput[i]);
        }

       if(userInput[0].equals("Hot"))
       {
           positive *= tempPos.get("hot");
           System.out.println(positive);
           negative *= tempNeg.get("hot");
           System.out.println(negative);
       }

       if(userInput[0].equals("Normal"))
       {
            positive *= tempPos.get("normal");
            System.out.println(positive);
            negative *= tempNeg.get("normal");
            System.out.println(negative);
       }

       if(userInput[0].equals("Cool"))
       {
           positive *= tempPos.get("cool");
           System.out.println(positive);
           negative *= tempNeg.get("cool");
           System.out.println(negative);
       }

       if(userInput[0].equals("Cold"))
       {
           positive *= tempPos.get("cold");
           System.out.println(positive);
           negative *= tempNeg.get("cold");
           System.out.println(negative);
       }

       if(userInput[1].equals("Yes"))
       {
           //positive *= achePos.get("yes");
           positive = positive * achePos.get("yes");
           System.out.println(positive);
           //negative *= acheNeg.get("yes");
           negative = negative * acheNeg.get("yes");
           System.out.println(negative);
       }

        if(userInput[1].equals("No"))
        {
            //positive *= achePos.get("no");
            positive = positive * achePos.get("no");
            System.out.println(positive);
            //negative *= acheNeg.get("no");
            negative = negative * acheNeg.get("no");
            System.out.println(negative);
        }

       if(userInput[2].equals("Yes"))
       {
           //positive *= coughPos.get("yes");
           positive = positive * coughPos.get("yes");
           System.out.println(positive);
           //negative *= coughNeg.get("yes");
           negative = negative * coughNeg.get("yes");
           System.out.println(negative);
       }
       if(userInput[2].equals("No"))
       {
           //positive *= coughPos.get("no");
           positive = positive * coughPos.get("no");
           System.out.println(positive);
           //negative *= coughNeg.get("no");
           negative = negative * coughNeg.get("no");
           System.out.println(negative);
       }

       if(userInput[3].equals("Yes"))
       {
           positive *= sorePos.get("yes");
           System.out.println(positive);
           negative *= soreNeg.get("yes");
           System.out.println(negative);
       }
       if(userInput[3].equals("No"))
       {
           positive *= sorePos.get("no");
           System.out.println(positive);
           negative *= soreNeg.get("no");
           System.out.println(negative);
       }

       if(userInput[4].equals("Yes"))
       {
           positive *= recentlyPos.get("yes");
           System.out.println(positive);
           negative *= recentlyNeg.get("yes");
           System.out.println(negative);
       }
       if(userInput[4].equals("No"))
       {
           positive *= recentlyPos.get("no");
           System.out.println(positive);
           negative *= recentlyNeg.get("no");
           System.out.println(negative);
       }
        positive *= covid19.get("Yes");
        System.out.println(positive);
        negative *= covid19.get("No");
        System.out.println(negative);

        System.out.println(positive + "     " + negative);
        if(negative > positive)
        {
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }


    }

}

