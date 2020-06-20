/**
 * Created by lingalal on 11/05/2020.
 */
public class test18 {
    public static void main(String[] args) {
        int []ia ={1,3,5,7,9};
        for(int x:ia){
            for( int j=0;j<3;j++){
                if(x>4 && x<8)
                    continue;
                System.out.println("" + x);
                if(j==1) break;
                continue;
            }
            continue;
        }
    }


   /*static int x=7;

    public static void main(String[] args) {
        String s = "";
        for (int y = 0; y < 3; y++) {
            x++;
            switch (x) {
                case 8:
                    s += "8";
                case 9:
                    s += "9";
                case 10: {
                    s += "10";
                    break;
                }
                default:
                    s += "d";
                case 13:
                    s += "13";
            }
        }
            System.out.println(s);

    }
        static {x++;}
*/
}
