package revision.chapter1.package1;

/**
 * Created by lingalal on 30/05/2020.
 */
public enum Traficlight {
    GREEN("Safe"),RED("danger"),ORANGE("warning");

    String desc;
    String getDesc()
    {return desc;}
/*    Traficlight()
    {
        System.out.println("test Desc");
    }*/

     Traficlight(String desc)
    {
        System.out.println("Traficlingh Desc");
        this.desc=desc;
    }

}



class Testdemo
{  private Traficlight t;
   private String name ;
    public static void main(String[] args) {

        for (Traficlight t: Traficlight.values()){
            //System.out.println(t);
            System.out.println(t.getDesc());
        }

        /*
        Traficlight tl = Traficlight.GREEN;
        System.out.println( Traficlight.RED);
       // System.out.println(Traficlight.ORANGE);*/
    }
}
