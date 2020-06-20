
package chapter3.video1.video3;

import java.security.PublicKey;

/**
 * Created by lingalal on 23/04/2020.
 */

public class Test2 {
    public Test2(String s)
    {}
    public static void main(String[] args) {
        Test2 s =new Test2("lakshman");
        s=null;
        System.gc();
        System.out.println("End of Main");
    }


    public void finalize()
    {
        System.out.println("Finalize Method called");
    }
}
