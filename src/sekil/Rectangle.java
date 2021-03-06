package sekil;



public class Rectangle extends Shape {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0) {
            System.err.println("invalid width: " + length);
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0) {
            System.err.println("invalid length: " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public Rectangle(double width, double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }

    public double area() {
        return width*length;
    }

    public double perimeter() {
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                ", Length: "+length+
                ", Width: "+width+
                ", Area: "+area()+
                ", Perimeter: "+perimeter()+
                '}';
    }
}
