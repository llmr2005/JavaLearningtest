package sample2402;

/**
 * Created by lingalal on 24/02/2020.
 */
interface Gadget{
     void doStuff();
}
abstract class Electronic1{
    void getPower()
    {
        System.out.println("plug in");
    }
}
public class Tablet extends Electronic1 implements Gadget {
     public void doStuff(){
        System.out.println("show book");
    }

    public static void main(String[] args) {
        new Tablet().getPower();
        new Tablet().doStuff();
    }
}
