package ShapeTask;

public class shapeTest {
    public static void main(String[] args) {

        Circle c1 = new Circle(4.0);
        Square s1 = new Square(3.0);
        Rectangle r1 = new Rectangle(4.0, 5.0);
        Triangle triangle=new Triangle(10.0,14.0,3,4);
        Triangle t2=new Triangle(15,20,10,15);

        System.out.println(c1);
        System.out.println(s1);
        System.out.println(r1);
        System.out.println(triangle);
        System.out.println(t2);
        System.out.println();

        System.out.println("c1.area = " + c1.area());
        System.out.println("c1.perimeter = " + c1.perimeter());
        System.out.println();

        System.out.println("s1.area = " + s1.area());
        System.out.println("s1.perimeter = " + s1.perimeter());
        System.out.println();

        System.out.println("r1.area = " + r1.area());
        System.out.println("r1.perimeter = " + r1.perimeter());
        System.out.println();

        System.out.println("triangle.area = " + triangle.area());
        System.out.println("triangle.perimeter = " + triangle.perimeter());

        System.out.println(t2.perimeter());
    }
}
