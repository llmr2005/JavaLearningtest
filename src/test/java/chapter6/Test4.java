package chapter6;

/**
 * Created by lingalal on 07/05/2020.
 */
public class Test4 {
    public static void main(String[] args) {
        Boolean b1 =true;
        Boolean b2 =true;
        Boolean b3 =true;
        if ((b1&b2)|(b2&b3)&b3)
            System.out.println("alpha");
        if((b1=false)|(b1&b2)|b1|b2)
            System.out.println("Beta");



    }
}
