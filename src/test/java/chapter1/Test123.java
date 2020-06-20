package chapter1;

/**
 * Created by lingalal on 05/02/2020.
 */
public class Test123 extends Object
{
    int salary =400;
    void m1()
    {

    }
static String dept ="IT";

    public static void main(String[] args) throws Throwable {
        Test123 tobj = new Test123();
        tobj.finalize();
    }
    protected void finalize()
    {
        System.out.println("override finalized ");
    }
}
