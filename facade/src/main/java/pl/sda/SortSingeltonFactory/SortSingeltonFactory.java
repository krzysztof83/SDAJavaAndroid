package pl.sda.SortSingeltonFactory;

import pl.sda.sort.factory.SortFactory;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-25.
 */
public class SortSingeltonFactory extends SortFactory {

    private static SortSingeltonFactory instance = new SortSingeltonFactory();

    public static SortSingeltonFactory getInstance() {
        return instance;
    }

}
