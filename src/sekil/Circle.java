package sekil;



class Circle extends Shape {
    private double radius;
    private final static double pi = 3.14;


    public Circle(double radius) {
        super("Circle");
        setradius(radius);
    }

    public double getradius() {
        return radius;
    }

    public void setradius(double radius) {
        if (radius<0){
            throw new RuntimeException("invalid radius");
        }
        this.radius = radius;
    }

    public double area() {
        return pi * radius * radius;
    }

    public double perimeter() {
        return 2 * pi * radius;
    }

    public String toString() {
        return "Circle{" +
                super.toString()+
                ", Radius: " + radius +
                '}';
    }

}
