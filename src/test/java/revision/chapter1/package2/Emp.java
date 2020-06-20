package revision.chapter1.package2;

//import revision.chapter1.package1.Address;

import static java.lang.System.*;

/**
 * Created by lingalal on 29/05/2020.
 */public class Emp extends Address {
    int id;
    String name;
    Address address;

    public Emp(int id, String name,Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        out.println(id+" "+name);
        out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1=new Address("gzb","UP","india");
        Address address2=new Address("gno","UP","india");

        Emp e=new Emp(111,"varun",address1);
        Emp e2=new Emp(112,"arun",address2);

        e.display();
        e2.display();

    }
}