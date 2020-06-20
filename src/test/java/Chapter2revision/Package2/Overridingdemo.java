package Chapter2revision.Package2;

import Chapter2revision.Package1.Child;
import Chapter2revision.Package1.Parent;

/**
 * Created by lingalal on 02/06/2020.
 */
public class Overridingdemo {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.marry();
        Child ch=new Child();
        ch.marry();

        Parent p1 = new Child();
        p1.marry();
        p1.property();
        ch.property();

    }
}
