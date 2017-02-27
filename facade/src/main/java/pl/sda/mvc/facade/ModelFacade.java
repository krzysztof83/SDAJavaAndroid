package pl.sda.mvc.facade;

import pl.sda.mvc.model.Model;

import java.util.ArrayList;
import java.util.List;

import static pl.sda.mvc.model.Model.values;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-27.
 */
public class ModelFacade {

//    public static List<Long> values = new ArrayList<>();

    public static List<Long> getValuesFacade() {

        return Model.getValues();
    }

    public static void addValuesFacade(long newValue) {
        Model.addValues(newValue);
    }
//
//    public static List<Long> getValues() {
//        return values;
//    }
//
//    public static void addValues(long newValue) {
//        values.add(newValue);
//    }

}
