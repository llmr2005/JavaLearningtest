package sample0403;

/**
 * Created by lingalal on 04/03/2020.
 */
public class Test {
    public void print(int i)
    {
        System.out.println(i);

    }
    public void print(long l)
    {
        System.out.println(l);

    }
    public void print(float f)
    {
        System.out.println(f);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.print(3);
        t.print(10L);
        t.print(5.5f);
    }
}
