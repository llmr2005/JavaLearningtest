package chapter5;

/**
 * Created by lingalal on 13/05/2020.
 */
 class This {
    static int i=7;
    void m1(){
       // int i=5;
        This ref = this;
        //m2(ref);
        m2(5);
        System.out.println(i);
        System.out.println(ref);//this means which object has been used to call this method
        System.out.println(i);
    }

    private This m2(int i) {
        i++;
        System.out.println(i);
        //o-i=7;
        return this;

    }
}
class ThisDemo extends This
{
    public static void main(String[] args) {
       This obj= new This();
       obj.m1();

    }
}
