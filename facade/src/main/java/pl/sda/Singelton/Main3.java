package pl.sda.Singelton;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-25.
 */
public class Main3 {
    public static void main(String[] args) {
        Singelton singelton = Singelton.getInstance();
        System.out.println(singelton.getCounter() + " " + singelton.getName());

        Singelton singelton2 = Singelton.getInstance();
        System.out.println(singelton.getCounter() + " " + singelton.getName());
    }
}
