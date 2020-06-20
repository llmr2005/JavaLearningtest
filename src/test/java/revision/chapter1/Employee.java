package revision.chapter1;

import org.omg.PortableInterceptor.ServerRequestInfo;

/**
 * Created by lingalal on 27/05/2020.
 */
public class Employee {
    private int empno;
    private String ename;
    private int sal;
    private String address;

    public void getsal()
    {
        System.out.println("display Sal");
    }

    Employee(int empno, String ename, int sal, String address)
    {
        this.empno = empno;
        this.ename=ename;
        this.sal=sal;
        this.address=address;
    }

    public static void main(String[] args) {
        Employee eobj = new Employee(123,"lakshman",5000,"london");

        System.out.println(eobj.address);
        System.out.println(eobj.ename);
    }

}
