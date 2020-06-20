package chapter6;

/**
 * Created by lingalal on 10/05/2020.
 */
public class Test14 {
    public static void main(String[] args) {

        l1:
        for (int i = 0; i < 5; i++) {
            m:
            for (int j = 0; j < 5; j++) {
                if (i == j)
                    System.out.println("hello");
                break m ;
            }
            System.out.println("Hi");
        }

   /* m1:
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                for (int k = 0; k < 5; k++)
                {
                    System.out.println("hello");
                    break m1;
                }*/


       /* for (int i = 0; i < 5; i++)
        {
            if(i==2)
                break; //continue;
            System.out.println(i);
        }
        System.out.println("hello");*/

       /* l1:
        {
            for (int i = 0; i < 5; i++) {
                if (i == 2)
                    break l1;
            }}
            System.out.println("hello");*/
        /*  String test = "Laskhman".toLowerCase().substring(1, 3);
        System.out.println(test);
        switch (1) {
            case 1:
                System.out.println("hello");
        }*/
            // try{int x=Integer.parseInt("two");


    }
}
