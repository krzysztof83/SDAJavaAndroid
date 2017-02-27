package pl.sda.decorator;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.sort.Sort;
import pl.sda.sort.impl.BubbleSort;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-27.
 */
public class DecoratorTest {

    @Test
    public void testdecorator() {

        //given
        int[] arrayToSort = new int[]{55, 33, 77, 1, -33, 0, -222, 5, -111};
        SortDecoratorwithReverse decoratorSort = new SortDecoratorwithReverse(new BubbleSort());

        //when
        int[] result = decoratorSort.sort(arrayToSort);

        //then
        Assert.assertEquals(77, result[0]);
        Assert.assertEquals(-222, result[result.length - 1]);

    }


}
