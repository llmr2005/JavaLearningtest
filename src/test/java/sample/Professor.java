package sample;

public class Professor{

   private String department;
   private long salary;
   private String educationalQualification;

    public Professor(String department, long salary, String educationalQualification) {
        this.department = department;
        this.salary = salary;
        this.educationalQualification = educationalQualification;
    }

    public String getDepartment() {
        return department;
    }
    public long getSalary()
    {
        return salary;
    }

}
