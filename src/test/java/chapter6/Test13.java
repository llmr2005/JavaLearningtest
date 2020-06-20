package chapter6;

/**
 * Created by lingalal on 10/05/2020.
 */
class Employee {

    public String empname;

    Employee(String name) {
        this.empname = name;
    }

    public String getEmpname() {
        return empname;
    }
//    for(i

    public static void main(String[] args) {
        Employee[] empArr = {new Employee("A"), new Employee("B")};
        // for (int i=0;i < empArr.length;i++)
        for (Employee e : empArr) {
            //Employee e = empArr[i];
            System.out.println(e.getEmpname());
            // System.out.println(e);
        }
    }
}
