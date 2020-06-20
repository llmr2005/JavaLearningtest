package chapter3.video1.video2;

/**
 * Created by lingalal on 20/04/2020.
 */
public class HeapStacksample2 {
    HeapStacksample2 t;
    int val;
    public HeapStacksample2(int val)
    {this.val=val;
    }
    public HeapStacksample2(int val ,HeapStacksample2 t) {
        this.val = val;
        this.t = t;
    }

    public static void main(String[] args) {
        HeapStacksample2 t1 = new HeapStacksample2(1);
        HeapStacksample2 t2 = new HeapStacksample2(2,t1);
        HeapStacksample2 t3= new HeapStacksample2(3,t1);
        HeapStacksample2 t4 = new HeapStacksample2(4,t2);
        t2.t= t3;
        t3.t= t4;
        t1.t= t2.t;
        t2.t=t4.t;
        System.out.println(t1.t.val);
        System.out.println(t2.t.val);
        System.out.println(t3.t.val);
        System.out.println(t4.t.val);

    }
}
