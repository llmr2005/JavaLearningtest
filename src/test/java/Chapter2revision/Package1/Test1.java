package Chapter2revision.Package1;

/**
 * Created by lingalal on 02/06/2020.
 */
public class Test1 {

    public int m1(int a,String b)
    {
        int m=a;
        //m=a+b;
        System.out.println("test m1");
        return m;
            }
   /* public void m1(int a,String b)
    {
        int m=a;
        //m=a+b;
        System.out.println("test m1");

    }*/

    public static void main(String[] args) {
        Test1 t= new Test1();
        t.m1(5,"abc");
    }

}
