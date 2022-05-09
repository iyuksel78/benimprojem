package sekil;

public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    public String toString() {
        return
                "name='" + name + '\'' +
                        ", Area='" + area() + '\'' +
                        ", Perimeter='" + perimeter() + '\'' +
                        '}';
    }
}
