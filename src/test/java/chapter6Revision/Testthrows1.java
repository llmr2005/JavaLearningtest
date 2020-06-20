package chapter6Revision;

class Parent {
    void msg() throws ArithmeticException {System.out.println("parent");}
}

class TestExceptionChild extends Parent{
    void msg(){
        System.out.println("TestExceptionChild");
    }
    public static void main(String args[]){
        Parent p=new TestExceptionChild();
        p.msg();
    }
}  