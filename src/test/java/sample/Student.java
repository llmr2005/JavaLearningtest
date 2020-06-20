package sample;

public class Student {


    int n =(int)5L;
    private int marks;
    private String address;

    public Student(int marks, String address) {
        this.marks = marks;
        this.address = address;
    }

    public int getMarks()
    {
        return marks;
    }
    public String getAddress()
    {
        return address;
    }
}