package chapter5;
import jdk.nashorn.internal.runtime.regexp.joni.WarnCallback;
public class Wraper {
/* private   final int salary1;//    {salary1=11;}   // static { salary1 =88;}    Wraper()    {salary1=99;}*///static Boolean b=false;
    public static void main(String[] args) {
      //Integer i1= Integer.parseInt("10");
        Integer i1=new Integer("5");
        String y=Integer.toString(10);
        String  z1=Integer.toString(1111,2);
        String  z=Integer.toBinaryString(10);
        System.out.println(z);
        Integer i= Integer.parseInt("111",2);
   /*     Integer i = new Integer(1022);
        int m=i.intValue();
        System.out.println(m);
       int  j=Integer.parseInt("12");
       Integer.valueOf(10);*/
        /*Float f=new Float(10.35f);
        System.out.println(f);
       *//* Double d= new Double(100L);
        System.out.println(d);*//*
       // System.out.println(b);
           /* {
           // private static final int salary1;
        }
        Wraper obj = new Wraper();

      *//*  Character c= new Character('c');
        System.out.println(c);
        Number n;
        Boolean b;
        Byte b1;
*/


      /*  int i=5;
        Integer j =i;
        System.out.println(j);*/
       /*
      // ArrayList<Integer> al = new ArrayList<>(5);

        int m=10;
      //  Short s= new Short(1"];
       // System.out.println(s);


        Boolean b = new Boolean("Yes");
        Boolean b1 = new Boolean("No");
        //Boolean b = new Boolean(True);
        System.out.println(b.equals(b1));
      Double d= new Double(10.5);

      Integer i = new Integer(10);
        Integer i1 = new Integer("22");

        Float f= new Float("66.88");
        Float f1= new Float("33");
        Float f2= new Float("33.5f");

        Character c= new Character('a');
        System.out.println(c);

        //Double d1= new Double("abc");
        //Double d3= new Double(double d);
        System.out.println(f);
*/
    }
}
