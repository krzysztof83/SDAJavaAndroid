package pl.sda.mvc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-25.
 */
public class Model {

    public static List<Long> values = new ArrayList<>();

    public static List<Long> getValues() {
        return values;
    }

    public static void addValues(long newValue) {
        values.add(newValue);
    }


}
