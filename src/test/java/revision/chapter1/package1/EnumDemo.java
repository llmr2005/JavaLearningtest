package revision.chapter1.package1;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import static java.lang.Math.*;
public class EnumDemo
{
    public static void main(String args[]){


        Directions dir = Directions.NORTH;
        if(dir == Directions.EAST) {
            System.out.println("Direction: East");
        } else if(dir == Directions.WEST) {
            System.out.println("Direction: West");
        } else if(dir == Directions.NORTH) {
            System.out.println("Direction: North");
        } else {
            System.out.println("Direction: South");
        }


        addExact(1,44);
    }
}
