package Chapter2revision.Package1;

/**
 * Created by lingalal on 02/06/2020.
 */
abstract public class Parent1 {
    protected void m1()
    {
        System.out.println("Parent class");
    }
    public abstract void m3();
}
class Child1 extends Parent1{
    public void m1(){
        System.out.println("child class");
    }


    public void m3(){}

    }


class demo {
    public static void main(String[] args) {
  Parent1 p=new Child1();
  Child1 c=new Child1();
  p.m1();
    }
}
