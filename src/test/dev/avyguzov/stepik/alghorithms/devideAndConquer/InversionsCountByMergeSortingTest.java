package dev.avyguzov.stepik.alghorithms.devideAndConquer;

import app.devideAndConquer.InversionsCountByMergeSorting;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class InversionsCountByMergeSortingTest {
    private final InversionsCountByMergeSorting InversionsCountByMergeSorting = new InversionsCountByMergeSorting();

    @Test
    public void simpleTest() {
        Queue<Integer> q = new LinkedList<Integer>();
        Long result = InversionsCountByMergeSorting.getInversionsCount(Arrays.asList(2, 3, 9, 2, 9));
        Assert.assertEquals(new Long(2), result);
    }

    @Test
    public void onlyOneElementGreaterThenNextTest() {
        Long result = InversionsCountByMergeSorting.getInversionsCount(Arrays.asList(1, 2, 3, 5, 4));
        Assert.assertEquals(new Long(1), result);
    }

    @Test
    public void allElementsGreaterThenNextTest() {
        Long result = InversionsCountByMergeSorting.getInversionsCount(Arrays.asList(7, 6, 5, 4, 3, 2, 1));
        Assert.assertEquals(new Long(21), result);
    }

    @Test
    public void oneElementTest() {
        Long result = InversionsCountByMergeSorting.getInversionsCount(Collections.singletonList(10));
        Assert.assertEquals(new Long(0), result);
    }

    @Test
    public void twoElementDescTest() {
        Long result = InversionsCountByMergeSorting.getInversionsCount(Arrays.asList(10, 4));
        Assert.assertEquals(new Long(1), result);
    }

    @Test
    public void twoElementAscTest() {
        Long result = InversionsCountByMergeSorting.getInversionsCount(Arrays.asList(1, 9));
        Assert.assertEquals(new Long(0), result);
    }

    @Test
    public void withEqualsNumbersTest() {
        Long result = InversionsCountByMergeSorting.getInversionsCount(Arrays.asList(6, 4, 5, 0, 0, 2));
        Assert.assertEquals(new Long(11), result);
    }

    @Test
    public void withTwoPairsTest() {
        Long result = InversionsCountByMergeSorting.getInversionsCount(Arrays.asList(9, 10, 9, 5, 7, 7));
        Assert.assertEquals(new Long(10), result);
    }

    @Test
    public void longTest() {
        Long result = InversionsCountByMergeSorting.getInversionsCount(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 3, 4, 3));
        Assert.assertEquals(new Long(15), result);
    }
}
