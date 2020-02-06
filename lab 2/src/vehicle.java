/*****************************************
 * Control: To run a class called vehicle
 * Author: Sultan Alghamdi
 * Date: 30th january 2020
 */
public class vehicle {
    String Owner_name;
    int Reg_no;
    int Max_Speed;
    String color;
    String Automatic;

    public vehicle (String Owner_name, int Reg_no)
    {
        this.Owner_name=Owner_name;
        this.Reg_no=Reg_no;

    }
    public vehicle (String Owner_name, int Reg_no, int Max_Speed, String color, String Automatic)
    {
        this.Owner_name=Owner_name;
        this.Reg_no=Reg_no;
        this.Max_Speed=Max_Speed;
        this.color=color;
        this.Automatic=Automatic;

    }

    public static void main(String[] args) {


        vehicle vehicle_1 = new vehicle ("Sultan Alghamdi",1234567,180,"Red","Automatic");
        System.out.println(vehicle_1);


    }
    public String toString(){

     return "The vehicle Owner is " + Owner_name + " \nThe Registration number is " + Reg_no + "\n The max speed is "
             + Max_Speed + " \nThe color is " + color + "\n The is an "+ Automatic +" Vehicle ";

    }

}
