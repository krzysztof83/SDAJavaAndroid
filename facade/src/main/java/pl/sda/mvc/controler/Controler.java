package pl.sda.mvc.controler;

import pl.sda.mvc.model.Model;

import java.util.List;
import java.util.Random;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-25.
 */
public class Controler {
    public int getFibonnaci(int n){
        Random random=new Random();
        int val=random.nextInt(20000);
        Model.addValues(val);
        return val;
    }

    public double average(){
        double sum=0;
        List<Integer> values= Model.getValues();
        for (int val:values) {
            sum+=val;
        }
        return sum/values.size();
    }

}
