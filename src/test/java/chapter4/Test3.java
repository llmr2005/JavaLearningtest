package chapter4;

/**
 * Created by lingalal on 28/04/2020.
 */
public class Test3 {
    public static void main(String[] args) {
        Test3 t1= new Test3();
        Test3 t2 =new Test3();
        Test3 t3=t1;
        System.out.println(t1==t3);
        System.out.println(t1==t2);
    }
}
