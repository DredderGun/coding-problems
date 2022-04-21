package dev.avyguzov.common.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The naive realisation of the quick sort.
 *
 * @author Aleksandr Vyguzov
 */
public class QuickSort {

    public List<Integer> doSort(List<Integer> currentList) {

        if (currentList.size() <= 1) {
            return currentList;
        } else {
            currentList = new ArrayList<>(currentList); // clone it

            Integer pivotEl = currentList.get(0);
            currentList.remove(pivotEl);

            List<Integer> less = currentList.stream().filter(el -> el > pivotEl).collect(Collectors.toList());
            List<Integer> more = currentList.stream().filter(el -> el < pivotEl).collect(Collectors.toList());
            less = doSort(less); // sort less array
            more = doSort(more); // sort more array
            
            ArrayList<Integer> result = new ArrayList<>();

            result.addAll(less);
            result.add(pivotEl);
            result.addAll(more);

            return result;
        }
    }
}
