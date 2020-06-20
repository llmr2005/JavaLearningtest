package sample2802;

/**
 * Created by lingalal on 28/02/2020.
 */
public class Employee3
{
    private int sal =5000;
    public String address ="London";
    public int getSal()
    {
        return sal;
    }

    public static void main(String[] args) {
        Employee3 obj = new Employee3();
        System.out.println(obj.sal);
        System.out.println(obj.getSal());
    }
}
