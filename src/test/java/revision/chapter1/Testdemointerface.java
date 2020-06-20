package revision.chapter1;

/**
 * Created by lingalal on 27/05/2020.
 */
public class Testdemointerface extends Hsbcdebitcard{
    public static void main(String[] args) {

        System.out.println(args[0]);
        Testdemointerface obj = new Testdemointerface();

        obj.deposit();
        obj.withdraw();
        System.out.println(obj.deposit());


    }
}
