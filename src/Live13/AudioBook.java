package Live13;

public class AudioBook extends Book {
    int length;
    String narrator;

    public AudioBook(String title, String type, String author, double price) {
        super(title, type, author, price);
    }


    public void listen(){
        System.out.println("listening to Live13.AudioBook");
        System.out.println("title = "+ title);
        System.out.println("author = " + author);
        System.out.println("length = " + length);
        System.out.println("narrator = " + narrator);
        System.out.println("price = " + price);
    }


}
