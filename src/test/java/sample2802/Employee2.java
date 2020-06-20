package sample2802;

/**
 * Created by lingalal on 28/02/2020.
 */
public class Employee2 {
    private int sal=5000;
    public String address ="london";

    public int getSal(){
        System.out.println(this);
        return sal;
    }
    public String getAddress(){
       getdept2();
        System.out.println(this);
        return address;
    }
    public static void getdept2(){
        System.out.println("Dept2");
    }
public static void getdept()
{
    //System.out.println(this);
    System.out.println("IT Department");
    new Employee2().getAddress();
    //getsal();
}
    public static void main(String[] args) {
       getdept();
        // getAddress();
//        Employee2 obj = new Employee2();
//        System.out.println(obj.getSal());
//        System.out.println(obj.getAddress());
        //Employee2.getdept();
    }
}
