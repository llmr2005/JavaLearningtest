package revision.chapter1.package1;

/**
 * Created by lingalal on 30/05/2020.
 */
public enum Colour {
    RED,GREEN,ORANGE;
    private String description;

    Colour(){
        System.out.println("enum consturctor");
    }

    public static void main(String[] args) {
        System.out.println("enaum main");
    }
}
class Test
{
    public static void main(String[] args) {
        Colour c = Colour.RED;
     //  / System.out.println(c);
        System.out.println("hello");
    }
}
