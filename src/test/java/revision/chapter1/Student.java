package revision.chapter1;

/**
 * Created by lingalal on 27/05/2020.
 */
public class Student {
    int rollno=11;
    String name="lakshman";
    String address="London";
    int marksmaths=55;
    int markseng=65;
    int avgmarks()
    {
        int  avg;
        avg = (marksmaths+markseng)/2;
        return avg;
    }

     String getName()
     {
         System.out.println("get name");
         return "mohan";
     }

     static void test()
     {
         System.out.println("test void");
     }
     int getRollno(int rollno)
     {
         this.rollno= rollno;
         return 123;
     }
     public Student(int rollno,String name)
     {this.rollno= rollno;
     this.name=name;}
     public Student()
     {}

    public static void main(String[] args) {
        //Student st1 =new Student();
        Student st = new Student(6434,"laskhmanmohanreddy");
        Student st1=new Student();
        st.test();
        System.out.println( st.rollno);
        System.out.println(st.name);
        System.out.println(st.avgmarks());
        System.out.println(st.getName());

    }

}
