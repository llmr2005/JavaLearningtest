package sample1902;

/**
 * Created by lingalal on 19/02/2020.
 */
public class Tire implements Bounceable {
    public void bounce()
    {
        System.out.println("test bounce");
    }
    public void setBounceFactor(int bf)
    {
        System.out.println("test setBounceFactor");
    }

    public static void main(String[] args) {
         Tire t = new Tire();
         t.bounce();
         t.setBounceFactor(20);

    }
}
