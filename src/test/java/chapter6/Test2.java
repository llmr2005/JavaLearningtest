package chapter6;

/**
 * Created by lingalal on 06/05/2020.-IllegalArgumentException
 */
public class Test2 {
    //static {
      //  int a=7/0;
   // }
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setPriority(1);
        try {
            int b = Integer.parseInt("abc");
            System.out.println(b);
        } catch (NumberFormatException e) {
            System.out.println("invalid number");
        }

        Test2 obj = new Test2();
        try {
            obj.m1();
        } catch (Throwable e) {
            System.out.println("Restricted");
            {

            }
        }
    }
    private void m1(){
        throw new Myexception();
        //System.out.println("Hello");
    }

}
class Myexception extends RuntimeException
{

}