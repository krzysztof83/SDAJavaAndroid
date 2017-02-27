package pl.sda.facade;

import pl.sda.observer.Observer;
import pl.sda.sort.Sort;
import pl.sda.sort.impl.CountSort;
import pl.sda.sort.impl.InsertSort;

/**
 * Created by RENT on 2017-02-25.
 */
public class SortFacade {

    private Observer observer = null;

    public SortFacade() {
    }

    public SortFacade(Observer observer) {
        this.observer = observer;
    }

    public int[] sortThroughFacade(int[] arrayToSort) {
        Sort sort = new InsertSort();
        return sort.sort(arrayToSort);
    }


    public int[] sortUsingCountSort(int[] arrayToSort) {
        Sort sort = new CountSort();
        for (int i = 0; i < arrayToSort.length; i++) {
            if (arrayToSort[i] < 0 && observer != null) {
                observer.react(arrayToSort[i]);
                arrayToSort[i] = 0;

            }
        }
        return sort.sort(arrayToSort);
    }
}
