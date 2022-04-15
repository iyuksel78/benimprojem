package ShapeTask;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            System.err.println("invalid side: " + side);
            System.exit(1);
        }
        this.side = side;
    }

    public double area() {
        return side*side;
    }

    public double perimeter() {
        return side*4;
    }

    public String toString() {
        return "Square{" +
                ", Side: "+side+
                ", Area: "+area()+
                ", Perimeter: "+perimeter()+
        '}';
    }
}
