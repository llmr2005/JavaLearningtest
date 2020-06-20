package chapter5;
import java.util.*;
class HashSet1{
    public static void main(String args[]){
        //Creating HashSet and adding elements
        Set set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        System.out.println(set);
        System.out.println(set.size());
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}