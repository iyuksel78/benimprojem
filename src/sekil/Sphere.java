package sekil;



class Sphere extends Shape implements Volume {

    public Sphere(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }


    @Override
    public double volume() {
        return 10*15;
    }


    public String toString() {
        return "Sphere{" +
                super.toString()+
                "volume=" + volume() +
                '}';
    }
}
