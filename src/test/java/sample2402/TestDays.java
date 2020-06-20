package sample2402;

/**
 * Created by lingalal on 24/02/2020.
 */
public class TestDays {
    public enum Days {MON,TUE,WED};

    public static void main(String[] args) {
        for (Days d :Days.values());
        Days [] d2 = Days.values();
        System.out.println(d2[0]);
    }
}
