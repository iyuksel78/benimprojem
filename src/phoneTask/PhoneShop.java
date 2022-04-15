package phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        iPhone iphone = new iPhone("12", "plus", 1000.0, "red");

        Samsung samsung = new Samsung("S10", "6.3 inches", 800.25, "grey");

        Nokia nokia = new Nokia("Brick", "2.5 inches", 30.50, "blue");

        System.out.println("iphone = " + iphone);
        System.out.println("samsung = " + samsung);
        System.out.println("nokia = " + nokia);
        System.out.println("===========================================");

        iphone.call(911);
        iphone.text(12345677);
        iphone.faceTime("g@gmail.com");
        iphone.faceTime(893981623);
        System.out.println("===========================================");

        samsung.call(155);
        samsung.text(45645677);
        samsung.freeze();
        System.out.println("===========================================");

        nokia.call(182);
        nokia.text(9876244);
        nokia.selfDefense();


    }


}
