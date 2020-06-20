/**
 * Created by lingalal on 07/02/2020.
 */
class Child extends Employee1 {
    public Child(int salary, String name) {
        super(salary, name);
    }


//    public Child(int salary, String name) {
//        super(salary, name);
//    }

    public static void main(String[] args) {
            Employee1 e1 = new Employee1(5000,"Mohan");
            e1.m1();
            e1.m2();
            System.out.println(e1.getName());
            System.out.println(e1.getSalary());

        }

}
