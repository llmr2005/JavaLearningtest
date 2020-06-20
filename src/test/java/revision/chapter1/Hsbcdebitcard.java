package revision.chapter1;

/**
 * Created by lingalal on 27/05/2020.
 */
abstract public class Hsbcdebitcard implements Debitcard{
    @Override
     public int  deposit() {
        int amout=1000;
        System.out.println("Deposit");
        return amout;

    }

    @Override
      public void withdraw() {
        System.out.println("withdraw");
    }


}
