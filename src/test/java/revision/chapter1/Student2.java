package revision.chapter1;

/**
 * Created by lingalal on 28/05/2020.
 */
public class Student2 {
    public static void main(String args[]){
        //Creating an object or instance
        Student1 s1=new Student1();//creating an object of Student
        Student1 s2=new Student1();
        s1.insertRecord(111,"Karan");
        s2.insertRecord(222,"Aryan");
        s1.displayInformation();
        s2.displayInformation();

       /* //Initializing objects
        s1.id=101;
        s1.name="Sonoo";
        s2.id=102;
        s2.name="Amit";
        //Printing data
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);*/
       /* s1.id=101;
        s1.name="Sonoo";
        System.out.println(s1.id +" " +s1.name);//printing members with a white space*/
    }
}
