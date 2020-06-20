package revision.chapter1.package1;

/**
 * Created by lingalal on 28/05/2020.
 */
public class Test1 {
    public int numebr;
    protected String name;
   public String address;


   protected void getName(){
       System.out.println("protected access specifier");
   }
   public void m1()
   {
       System.out.println("Testm1");
   }
   private void m2()
   {
       System.out.println("testm2");
   }

    public static void main(String[] args) {
        Test1 t=new Test1();
        System.out.println(t.numebr);
        t.m1();
        t.m2();
    }
}
