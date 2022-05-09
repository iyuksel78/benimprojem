package sekil;

public class TestShape {
    public static void main(String[] args) {
        Circle c1= new Circle(10.5);
        c1.area();
        c1.perimeter();
        c1.setradius(12.5);
        System.out.println("c1 = " + c1);

        Shape sh= new Cube("selim");
        System.out.println(sh.area());
        System.out.println("sh = " + sh);

        Cube cb= new Cube("cahit");
        System.out.println(cb.volume());
        System.out.println("cb = " + cb);

        Sphere sp= new Sphere("kadik");
        System.out.println("sp.volume() = " + sp.volume());
        System.out.println("sp = " + sp);
    }
}
