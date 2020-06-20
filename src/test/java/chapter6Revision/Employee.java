package chapter6Revision;

/**
 * Created by lingalal on 14/06/2020.
 */
public class Employee {

    private String empname;

    public Employee(String name){
        this.empname=name;
    }
    public String getEmpname(){return empname;}

    public String toString(){return this.empname;}


    public static void main(String[] args) {
           Employee []emparr = { new Employee("Test1"),new Employee("Test2"),new Employee("Test3")};
           /*for(int i=0;i<emparr.length;i++)
           {
               Employee e= emparr[i];
               System.out.println(e.getEmpname());
               System.out.println(e);
           }*/

           for(Employee e:emparr) {
               System.out.println(e.getEmpname());
               System.out.println(e);
           }

    }

}
