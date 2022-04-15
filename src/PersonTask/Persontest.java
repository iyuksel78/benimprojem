package PersonTask;

public class Persontest {

    public static void main(String[] args) {

        Developer dv= new Developer("ahmet",34,'M',12345,"SDET",234500);

        dv.getName();
        System.out.println(dv);

        dv.work();


    }
}
