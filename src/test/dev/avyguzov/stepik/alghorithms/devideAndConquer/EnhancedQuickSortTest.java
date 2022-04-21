package dev.avyguzov.stepik.alghorithms.devideAndConquer;

import app.devideAndConquer.EnhancedQuickSort;
import org.junit.Assert;
import org.junit.Test;

public class EnhancedQuickSortTest {
    private final EnhancedQuickSort quickSort = new EnhancedQuickSort();

    @Test
    public void mustCorrectlySortArray() {
        int[] list = new int[] {5, 7, 8, 1, 9, 0};
        quickSort.doSort(list);

        Assert.assertArrayEquals(new int[]{0, 1, 5, 7, 8, 9}, list);
    }

    @Test
    public void mustCorrectlySortReversedArray() {
        int[] list = new int[] {9, 8, 7, 6, 5, 4};
        quickSort.doSort(list);

        Assert.assertArrayEquals(new int[] {4, 5, 6, 7, 8, 9}, list);
    }

    @Test
    public void mustCorrectlySortAlreadySortedArray() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        quickSort.doSort(list);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, list);
    }

    @Test
    public void mustCorrectlySortFewUniqueArrayElements() {
        int[] list = new int[]{1, 2, 3, 2, 5, 2, 1, 3, 5, 1, 1};
        quickSort.doSort(list);

        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 2, 2, 2, 3, 3, 5, 5}, list);
    }
}
