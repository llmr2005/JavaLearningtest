package revision.chapter1;

/**
 * Created by lingalal on 28/05/2020.
 *///Java Program to create and call a default constructor
class A{
    void m(){System.out.println("hello m");}
    void n(){
        System.out.println("hello n");
//m();//same as this.m()
        this.m();
    }
}
class TestThis4{
    public static void main(String args[]){
        A a=new A();
        a.n();
    }}