package Chapter2revision.Package1;

/**
 * Created by lingalal on 02/06/2020.
 */
public class Student {
    private int rollno=3232;
    private String name ="Lakshman";
    private String address ="London";
    private static String dept="IT dept";

    public int getRollno() {
        return rollno;
    }

    public String getAddress() {
        getDept();

        return address;
    }

    public static String getDept() {
        return dept;
    }
}

class studentdemo{
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println();st.getRollno();
        System.out.println(st.getAddress());
    }
}
