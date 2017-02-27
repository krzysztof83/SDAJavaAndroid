package pl.sda.Singelton;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-25.
 */
public class Singelton {
    private static Singelton instance = new Singelton();
    private static int counter = 0;

    private Singelton() {
        counter++;
    }


    public static Singelton getInstance() {
        return instance;
    }

    public int getCounter() {
        return counter;
    }

    public String getName() {
        return "Singeltos";
    }

}
