package pl.sda.adapter;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-27.
 */
public class PersonImpl implements Person {
    @Override
    public void move(){
        System.out.println("Idę");
    }
    @Override
    public void say(){
        System.out.println("mowie");
    }

}
