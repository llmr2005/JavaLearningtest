package chapter6;

/**
 * Created by lingalal on 11/05/2020.
 */
public class Test15 {

    public static void main(String[] args) {
        try
        {
            int data=50/0; //may throw exception
        }
        //handling the exception
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
