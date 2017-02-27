package pl.sda.observer;

import pl.sda.sort.Sort;
import pl.sda.sort.impl.CountSort;

import java.util.Objects;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-25.
 */
public class Observer {


    public void react(int val) {
        System.out.println("Wratosc " + val + " zmieniono na 0");
    }


}
