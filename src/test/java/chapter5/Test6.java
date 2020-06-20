package chapter5;

/**
 * Created by lingalal on 20/05/2020.
 */
public class Test6 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Mohan");
        System.out.println(sb.charAt(4));
        System.out.println(sb.append("reddy"));
        System.out.println(sb.insert(1,"test"));
        System.out.println(sb.replace(1,3,"a"));
        System.out.println(sb.capacity());
        sb.ensureCapacity(66);
        System.out.println(sb.capacity());
        /*StringBuffer sb = new StringBuffer("Lakshman");
        System.out.println(sb.capacity());*/
        /*System.out.println(sb.replace(1,2,"a"));
        System.out.println(sb.delete(1,2));
        System.out.println(sb.reverse());*/
        /*System.out.println(sb.append("mohan"));
        System.out.println(sb.insert(1,"aa"));*/

        /*String s1="java";//creating string by java string literal
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);//converting char array to string
        String s3=new String("lakshman2");//creating java string by new keyword
        String s4 = "Lakshman";
        String s5 =new String("Lakshman1");
        System.out.println(s5.startsWith("La"));
        System.out.println(s5.endsWith("1"));
        System.out.println(s5.replace("Lakshman","Mohan"));*/
        //System.out.println(s4.compareTo(s5));
        //System.out.println(s3==s5);
        //System.out.println(s3.equalsIgnoreCase(s4));
        /*System.out.println(s4.trim());
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);*/

      /*  System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);*/
        /*System.out.println(s3.charAt(1));
        System.out.println(s3.length());
        System.out.println(s3.substring(1,3));
        System.out.println(s3.contains("b"));
        System.out.println(s3.toString());
        //System.out.println(s3.join("x","p"));
        System.out.println(s3.equals(s4));
        System.out.println(s3.isEmpty());*/
        /*System.out.println(s3.concat(s4));
        System.out.println(s4.replace('a','b'));
        System.out.println(s4.replace("la","ka"));
        System.out.println(s4.toLowerCase());
        System.out.println(s4.toUpperCase());*/
/*



    char []ch = {'j','a','v'};
    String s=new String(ch);
        System.out.println(s);
*/

}  }
