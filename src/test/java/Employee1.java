/**
 * Created by lingalal on 07/02/2020.
 */
public  class Employee1 {

    private int salary;
    private String name;

    public Employee1(int salary,String name)
    {
        this.salary = salary;
        this.name = name;

    }

    public int getSalary(){
        return salary;
    }
    public String getName()
    {
        return  name;
    }
    void m1()
    {
        System.out.println("M1");
    }

    void m2()
    {
        System.out.println("M2");
    }
}


