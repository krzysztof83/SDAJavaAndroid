package pl.sda.SortSingeltonFactory;

import pl.sda.sort.Sort;
import pl.sda.sort.factory.SortTypeEnum;

import java.util.Arrays;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-25.
 */
public class Main4 {

    public static void main(String[] args) {
        SortSingeltonFactory factory=SortSingeltonFactory.getInstance();

        Sort sort=factory.produce(SortTypeEnum.BUBBLE);

        int[] sortedArray=sort.sort(new int[]{4234,65654,13214,634,123,8867});

        System.out.println(Arrays.toString(sortedArray));
    }

}
