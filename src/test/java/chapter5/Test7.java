package chapter5;
import java.util.*;
/**
 * Created by lingalal on 23/05/2020.
 */
public class Test7 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Rama");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("krishna");
        list.add("lakshmanmohan");
        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<String> itr=list.iterator();
        itr.forEachRemaining(a-> //Here, we are using lambda expression
        {
            System.out.println(a);
        });
        /*System.out.println("Traversing list through forEach() method:");
        //The forEach() method is a new feature, introduced in Java 8.
        list.forEach(a->{ //Here, we are using lambda expression
            System.out.println(a);
        });*/
       /* for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }  */

       /* System.out.println("Traversing list through List Iterator:");
        //Here, element iterates in reverse order
        ListIterator<String> list1=list.listIterator(list.size());
        while(list1.hasPrevious())
        {
            String str=list1.previous();
            System.out.println(str);
        }*/
       /* for(String obj:list)
        {
            System.out.println(obj);
        }*/
        //Traversing list through Iterator
        /*Iterator itr =list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());*/
        }
}
