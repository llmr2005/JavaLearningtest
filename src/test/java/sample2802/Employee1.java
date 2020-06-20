package sample2802;

/**
 * Created by lingalal on 28/02/2020.
 */
public final class Employee1 {
    private int sal;
    public int getSal(int empid){
        System.out.println("EMP id " +empid);
        return empid;
    }
    public int getSal(int empid,int x){
        System.out.println("EMP id " +(empid+x));
        return empid;
    }
    public int getSal(int empid,int x,int y){
        System.out.println("EMP id " +(empid+x+y));
        return empid;
    }
public int getSal(int ...x)
{
    System.out.println("array"+x.length);
    return x.length;
}
    public static void main(String[] args) {
        Employee1 obj = new Employee1();
        obj.getSal(5,6,9);
    }

}


