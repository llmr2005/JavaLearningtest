package chapter3.video1.video3;

import static java.lang.System.gc;

/**
 * Created by lingalal on 23/04/2020.
 */
public class FinaliseDemo {
    public static void main(String[] args) {
        FinaliseDemo obj= new FinaliseDemo();
        obj.finalize();
        obj.finalize();
        obj=null;
        System.gc();
    }
    public void finalize()
    {
        System.out.println("Finalise method called");
    }
}
