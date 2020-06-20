package chapter6Revision;

/**
 * Created by lingalal on 11/06/2020.
 */
 class Throw1 {
    /* static {int m=7/0;
     }*/
    public static void main(String[] args) {

      /*   Thread t=new Thread();
         t.setPriority(10);
         t.start();
         t.start();

         int m;
      *//*   if(true);
        System.out.println("test");
        else*//*


      int x=10;
      final int y=20;
      do
      while(x>y)
      {
          System.out.println("test");
      }
      while (false);
        Systealsem.out.println("test");
*/
        for(;;) {
            int p = 0;
            System.out.println(p);
        }
       // System.out.println("test");


        /* int age ;
         try{
         age=Integer.parseInt("abc");} catch (RuntimeException e){
             System.out.println("handleexcpt");
         }*/

      /*  Throw1 obj = new Throw1();
        obj.m1();*/
    }

    private void m1() throws MyException {
        throw new MyException();
        //System.out.println("test");
    }
}
class MyException extends RuntimeException{

}
