package sample;

public class ClientDemo  {

    public static void main(String[] args) {

        Student student = new Student(100, "somethjing");
        Professor professor = new Professor("MPC", 12345, "btech");

        System.out.println("student marks are : " + student.getMarks());
        System.out.println("Professor Dept is : " + professor.getDepartment());
        System.out.println("Salary " + professor.getSalary() );

    }
}