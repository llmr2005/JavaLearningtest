package chapter6;

/**
 * Created by lingalal on 12/05/2020.
 */
interface Vechile{
    void drive();
}
class Car implements Vechile{
    @Override
    public void drive(){}
}
 class Test {
    public Vechile getVechile()
    {
        return new Car();
    }
    public static void main(String[] args) {
        Test obj =new Test();
        obj.getVechile();


    }
}
