package chapter3Revision;

import java.awt.*;
import java.lang.reflect.Method;

/**
 * Created by lingalal on 07/06/2020.
 */
public class Test {


    public static void main(String[] args) throws Throwable {
     Object o= Class.forName("java.lang.String").newInstance();
        //System.out.println(o.getClass().getMethods());
        Method[] methods =o.getClass().getMethods();
        for(Method m1:methods)
        {
            System.out.println(m1.getName());
        }
/*

        Test t = new Test();
        t.finalize();


        Runtime.getRuntime().gc();
        System.gc();
*/

    }
/*
    public static void main(String[] args) {
        Dimension a1= new Dimension(5,10 );
        System.out.println("a1 hight+"+a1.height);
        Dimension b1=a1;
        b1.height=30;
        System.out.println("a1 hight:   "+a1.height+""+ "    b1 hight :  " + b1.height);
    }*/
}