package Chapter2revision.Package2;

import Chapter2revision.Encaptulation;

/**
 * Created by lingalal on 02/06/2020.
 */
public class Emp {

    public static void main(String[] args) {
        //System.out.println(this);
        Encaptulation obj = new Encaptulation();
        System.out.println(obj.getAddress());
        System.out.println(obj.getSal());
        Encaptulation.getDept();

    }
}
