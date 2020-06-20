package chapter5Revision;

/**
 * Created by lingalal on 14/06/2020.
 */

    class This
        {
        void m2()
        {
        System.out.println(this);
        }
        }
    class Thisdemo extends This{
        public static void main(String[] args) {
            new This().m2();
        }
        void m2()
        {
           // super();}
    }}
