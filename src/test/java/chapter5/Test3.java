package chapter5;

/**
 * Created by lingalal on 14/05/2020.
 */
public class Test3 {
    public static void main(String[] args) {

        int [][] a= {{1,2},{3,4}};
        int b [] = (int [])a[1];
        Object o1 =a;
        int [][]a2 = (int [][]) o1;
        int []b2 = (int []) o1;
        System.out.println(b[1]);
/*

        int [][]x= new int[2][];
        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[0][0]);
*/



   /* int [][]x= new int[2][3];
        System.out.println(x[0]);
        System.out.println(x[0][0]);
        */
    }
}
