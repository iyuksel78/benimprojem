package ShapeTask;

public class Triangle extends Shape {

    private double heigth;
    private double base;
    private double sideB;
    private double sideC;

    public Triangle(double heigth, double base, double sideB, double sideC) {
        super("Triangle");
        setHeigth(heigth);
        setBase(base);
        setSideB(sideB);
        setSideC(sideC);
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double area() {
    return ((base * base) + (sideB * sideB) + (sideC * sideC));
    }

    public double perimeter() {
        return base + sideB + sideC;
    }


    public String toString() {
        return "Triangle{" +
                "heigth=" + heigth +
                ", base=" + base +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
