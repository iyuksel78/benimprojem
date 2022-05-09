package PersonTask;

import java.util.ArrayList;
import java.util.Arrays;


public class Persontest {

    public static void main(String[] args) {

        Developer dv= new Developer("ahmet",34,'M',12345,"SDET",234500);
        Developer dv2= new Developer("rasim",34,'M',12345,"SDET",234500);
        Developer dv3= new Developer("selim",34,'M',12345,"SDET",234500);
        ArrayList<Developer> developers= new ArrayList<>();
        developers.addAll(Arrays.asList(dv,dv2,dv3));

        System.out.println(developers);



        dv.getName();
        System.out.println(dv);

        System.out.println("0000000000000");
        dv.work();
dv.fixingBugs();


    }
}
