package chapter5;
import java.util.*;
class TreeSet2{

        public static void main(String args[]){
            TreeSet<Integer> set=new TreeSet<Integer>();
            set.add(24);
            set.add(66);
            set.add(12);
            set.add(15);
            System.out.println(set);
            System.out.println("Highest Value: "+set.pollFirst());
            System.out.println("Lowest Value: "+set.pollLast());
        }

    /*
    public static void main(String args[]){
        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ajay");
        System.out.println("Traversing element through Iterator in descending order");
        Iterator i=set.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }*/
}