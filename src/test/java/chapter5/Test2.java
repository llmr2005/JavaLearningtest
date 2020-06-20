package chapter5;

/**
 * Created by lingalal on 14/05/2020.
 */
public class Test2 {
    public static void main(String[] args) {
        int i= 0;

        //int a[]=new int[-1];
        int iA[] ={10,20};
        iA[i]=i=30; //if you have multiple operends it will get evaluated left to right
        System.out.println("" + iA[0] + "" +iA[1] +"" + i );
    }

}
