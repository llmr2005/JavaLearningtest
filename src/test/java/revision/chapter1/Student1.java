package revision.chapter1;

/**
 * Created by lingalal on 28/05/2020.
 */
//Java Program to illustrate how to define a class and fields
//Defining a Student class.
class Student1{
    //defining fields
    int rollno;//field or data member or instance variable
    String name;
    //creating main method inside the Student class
    void insertRecord(int r, String n){
        this.rollno=r;
        this.name=n;
    }
    void displayInformation(){System.out.println(rollno+" "+name);}

}
