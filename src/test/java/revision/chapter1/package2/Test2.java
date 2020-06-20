package revision.chapter1.package2;

import revision.chapter1.package1.Test1;

/**
 * Created by lingalal on 28/05/2020.
 */
public class Test2 extends Test1 {
    public int rno;
    public  String sname;
    public void m1()
    {
        System.out.println("Inside test2");
    }
    public void m3()
    {
        System.out.println("test m3");
    }

    public static void main(String[] args) {
        Test2 t1 = new Test2();
        Test1 t2=new Test2();
        t1.m3();
        t1.m1();

        t2.m1();
        t1.getName();

    }

}
