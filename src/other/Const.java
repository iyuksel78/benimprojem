package other;

class telA{
    public telA(int a){
        System.out.println("A");

    }
}

class telB extends telA{

    public telB(int a){
        super(9);
        System.out.println("v");
    }
}


public class Const {


    public static void main(String[] args) {

        telA a1= new telA(8);
        telB b1= new telB(7);


    }
}
