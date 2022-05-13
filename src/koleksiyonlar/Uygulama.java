package koleksiyonlar;

import java.util.ArrayList;
import java.util.Collections;

public class Uygulama {

    public static void main(String[] args) {
        ArrayList<String> çalışanlar=new ArrayList<String>();
        çalışanlar.add("Ahmet");
        çalışanlar.add("Mehmet");
        çalışanlar.add("Hande");
        çalışanlar.add("Hüseyin");
        System.out.println("Hande ismini listeden silelim.");
        çalışanlar.remove(2);
        çalışanlarıYazdır(çalışanlar);
        System.out.println("Mehmet ile Hüseyin arasına Elif ekleyelim.");
        çalışanlar.add(2, "Elif");
        çalışanlarıYazdır(çalışanlar);
        System.out.println("Mehmet yerine Muhammet koyalım.");
        çalışanlar.set(1, "Muhammet");
        çalışanlarıYazdır(çalışanlar);
        System.out.println("Çalışanları alfabetik olarak (a-z) sıralayalım.");
        Collections.sort(çalışanlar);
        çalışanlarıYazdır(çalışanlar);
        System.out.println("Çalışanları alfabetik olarak (z-a) sıralayalım.");
        Collections.reverse(çalışanlar);
        çalışanlarıYazdır(çalışanlar);
    }
    private static void çalışanlarıYazdır(ArrayList<String> çalışanlar) {
        for (String string : çalışanlar) {
            System.out.println(string);
        }
    }
}