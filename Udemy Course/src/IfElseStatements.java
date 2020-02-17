import java.sql.SQLOutput;

public class IfElseStatements {
    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }
        //Using if statement
        int topscore = 100;
        if (topscore == 100) {
            System.out.println("You got the high score");
        }
         //If statement with AND condition
        int secondtopscore = 100;
        if( (topscore > secondtopscore) && (topscore< 100) ){
            System.out.println("Greater than second top score and less than 100");
        }

        //If statement with OR condition
        if( (topscore>90) || (secondtopscore<=90) ){
            System.out.println("either or both of the conditions are true");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }
        boolean isCar= false;
        if(isCar = true){
            System.out.println("This is not supposed to happen");
        }
        boolean wasCar = isCar ? true : false;
        isCar=true;
        if (wasCar){
            System.out.println("WasCar is true");
        }
    }
}

