package shapes;

public class Control {
    public static void main(String[] args) {

        circle c1= new circle(10);
        double area =c1.calculateArea();

        System.out.println(area);
    }
}
