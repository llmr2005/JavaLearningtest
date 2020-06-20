package chapter1;

/**
 * Created by lingalal on 05/02/2020.
 */
public class A1 {
    public int x=5;
    private int y =7;
}
class B1 extends A1{

    public static void main(String[] args) {
        B1 b = new B1();
        System.out.println(b.x);
         A1 a =new A1();
        System.out.println(a.x);
    }


}
