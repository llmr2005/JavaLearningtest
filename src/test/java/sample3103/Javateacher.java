package sample3103;

/**
 * Created by lingalal on 31/03/2020.
 */
public class Javateacher {
    private int Salary =000;
    private static Javateacher teacherinstance  =null;
    private Javateacher()
    {
        System.out.println("Constucter invoked ");
    }
  public static Javateacher getTeacherinstance()
  {
      if (teacherinstance==null)
      {
          teacherinstance = new Javateacher();
      }
      return teacherinstance;
  }

    public static void main(String[] args) {
        A obj = new A();
        //Javateacher obj = new Javateacher();
        Javateacher obj1 = new Javateacher();

    }
}
