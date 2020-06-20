package Chapter2revision;

import net.bytebuddy.utility.JavaModule;

/**
 * Created by lingalal on 02/06/2020.
 */
public class Encaptulation {
    private int rollNo;
    private String name;
    private int sal=555;
    private static String address ="London";

    public int getSal() {
        System.out.println(this);
        //getDept();
        return sal;
    }

    public static String getAddress() {
        return address;
    }
    public static void getDept(){
        //System.out.println(this);
        System.out.println("IT dept");
        getAddress();
        new Encaptulation().getSal();
    }
    public static void main(String[] args) {

        Encaptulation obj = new Encaptulation();
        //System.out.println(this.getSal());
        System.out.println(obj.getAddress());
        System.out.println(obj.getSal());
        getDept();
    }

}
