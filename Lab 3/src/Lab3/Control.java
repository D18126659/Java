package Lab3;

public class Control {


    public static void main(String[] args) {


            Employee p1= new Employee("Rob","Williams",4783, 5000);
            SalesEmployee p2 = new SalesEmployee("Paige","Heston",7893,1000,13);
            HourlyEmployee p3= new HourlyEmployee("Emma","Fitzgerald",3245,34,9.8);

            System.out.println(p1);
            System.out.println("\n");
            System.out.println(p2);
            System.out.println("\n");
            System.out.println(p3);

            Employee[] myEmployee = new Employee[3];

            myEmployee[0]= p1;
            myEmployee[1]= p2;
            myEmployee[2]= p3;

            for(int i=0;i<3;i++){
                double Emp = myEmployee[i].calculatepay();

                System.out.println(Emp);


            }




    }



}
