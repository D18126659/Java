package shapes;

public class circle extends shape {

    private double radius;
    private double pi=3.14;

    public circle (double radius)
    {
        this.radius=radius;
    }
    double calculateArea() {
        return pi*radius*radius;
    }
}
