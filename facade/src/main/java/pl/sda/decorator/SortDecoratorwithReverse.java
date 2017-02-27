package pl.sda.decorator;

import pl.sda.sort.Sort;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-27.
 */
public class SortDecoratorwithReverse implements Sort {

    private Sort sort;

    public SortDecoratorwithReverse(Sort sort){
        this.sort=sort;
    }

        @Override
    public int[] sort(int[] arrayToSort){
        int[] result=sort.sort(arrayToSort);
        int[] reverseResult=new int[arrayToSort.length];
        for (int i = 0; i < arrayToSort.length; i++) {
            reverseResult[i]=result[arrayToSort.length-i-1];
        }
        return reverseResult;
    }

}
