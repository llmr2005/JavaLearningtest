package chapter3.video1;

/**
 * Created by lingalal on 19/04/2020.
 */
public class Book {
    private String tiltle;

    public String GetTiltle()
    {
        return tiltle;
    }

    public static void main(String[] args) {
        String t="abc";
        Book b = new Book();
        String s = b.GetTiltle();
        System.out.println(s);

    }
}
