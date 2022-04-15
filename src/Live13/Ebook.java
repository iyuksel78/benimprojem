package Live13;

public class Ebook extends Book{
    int size;
    int pages;

    public void readBook()
    {
        System.out.println("reading book from my tablet");
        System.out.println("title = "+ title);
        System.out.println("author = " + author);
        System.out.println("size = " + size);
        System.out.println("pages = " + pages);
    }
}
