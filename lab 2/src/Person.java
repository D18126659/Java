/*****************************************
 * Doesn't work Fix later D:
 * Control: To run a class called person
 * Author: Sultan Alghamdi
 * Date: 5th February 2020
 */
public class Person {
    private int dob;
    private String name;

    //Setter for dob
        public void setDob(int NewDob)
         {
            dob=NewDob;

            Person P1= new Person();
            P1.setDob(-1);
            // P1.setDob("john");

             int birthday = P1.getDob();
         }
         public int getDob()
         {
             return dob;
         }

    public static void main(String[] args) {
        System.out.println();
    }
}
