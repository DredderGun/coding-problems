package dev.avyguzov.common.sorting;

import java.util.List;

/**
 * The quick sort with Hoare break algorithm.
 *
 * @author Aleksandr Vyguzov
 */
public class QuickSortHoareBreak {
    public List<Integer> start(List<Integer> currentList) {
        doSort(currentList, 0, currentList.size() - 1);
        return currentList;
    }

    private void doSort(List<Integer> currentList, Integer startIndex, Integer endIndex) {
        if (startIndex < endIndex) {
            Integer pivotIndex = hoareBreak(currentList, startIndex, endIndex);
            doSort(currentList, startIndex, pivotIndex - 1);
            doSort(currentList, pivotIndex + 1, endIndex);
        }
    }

    private Integer hoareBreak(List<Integer> list, Integer low, Integer high) {
        Integer pivot = list.get((low + high) / 2);
        Integer i = low - 1;
        Integer j = high + 1;

        while (true) {
            do {
                i++;
            } while (list.get(i) < pivot);

            do {
                j--;
            } while (list.get(j) > pivot);

            if (i >= j) return j;

            swapElements(list, i, j);
        }
    }

    private void swapElements(List<Integer> list, Integer low, Integer high) {
        Integer bufferEl = list.get(low);
        list.set(low, list.get(high));
        list.set(high, bufferEl);
    }
}
