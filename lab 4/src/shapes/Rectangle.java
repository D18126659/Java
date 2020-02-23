package shapes;
public class Rectangle extends shape {

    private double length;
    private double width;

    public Rectangle(double length,double width,double x, double y)
    {
        this.length   = length;
        this.width    = width;
        centerX       = x;
        centerY       = y;

    }

     public double calculateArea() {
        return length*width;
    }
}
