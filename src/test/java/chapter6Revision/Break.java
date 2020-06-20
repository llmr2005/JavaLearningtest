package chapter6Revision;

/**
 * Created by lingalal on 14/06/2020.
 */
public class Break {
    public static void main(String[] args) {
        l1:
        for(int i=0;i<3;i++)
            m:
        for(int j=0;j<3;j++) {
            if (i == j)
                break;
            System.out.println(i + "    " + j);
        }
        System.out.println("hello");
    }
}
