package ShapeTask;

public class Circle extends Shape {
    private double raidus;
    private static double pi = 3.14;


    public Circle(double raidus) {
        super("Circle");
        setRaidus(raidus);
    }

    public double getRaidus() {
        return raidus;
    }

    public void setRaidus(double raidus) {
        this.raidus = raidus;
    }

    public double area() {
        return pi * raidus * raidus;
    }

    public double perimeter() {
        return 2 * pi * raidus;
    }

    public String toString() {
        return "Circle{" +
                ", Radius: " + raidus +
                ", Pi: " + pi +
                ", Area: " + area() +
                ", Perimeter: " + perimeter() +
                '}';
    }

}
