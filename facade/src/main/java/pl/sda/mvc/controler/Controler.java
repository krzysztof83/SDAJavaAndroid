package pl.sda.mvc.controler;

import pl.sda.fibonacci.Fibonacci;
import pl.sda.fibonacci.fibonacciImpl.FibonacciEnum;
import pl.sda.fibonacci.fibonacciImpl.FibonacciFabric;
import pl.sda.mvc.model.Model;

import java.util.List;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-25.
 */
public class Controler {
    public int getFibonnaci(int n){
        Fibonacci fibonacci= FibonacciFabric.produce(FibonacciEnum.ITERATION);
        int val=(int)fibonacci.getN(n);
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
