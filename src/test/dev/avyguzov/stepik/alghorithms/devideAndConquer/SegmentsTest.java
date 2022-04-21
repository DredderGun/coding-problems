package dev.avyguzov.stepik.alghorithms.devideAndConquer;

import app.devideAndConquer.Segments;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SegmentsTest {
    @Test
    public void testSegments() {
        int[] points = new int[] {1, 6, 11};

        Assert.assertEquals(Arrays.asList(1, 0, 0),
                Segments.getSegmentsAndPointsCrossingAmounts(new int[]{0, 7}, new int[]{5, 10}, points));
    }

    @Test
    public void ordinaryTest() {
        int[] points = new int[] {3, 6, 10};

        Assert.assertEquals(Arrays.asList(2, 3, 1),
                Segments.getSegmentsAndPointsCrossingAmounts(new int[] {5, 2, 1, 6}, new int[] {10, 6, 4, 8}, points));
    }

    @Test
    public void testFromStepik() {
        int[] points = new int[] {1, 2, 3, 4, 5, 6};
        Assert.assertEquals(Arrays.asList(2, 3, 6, 3, 2, 1),
                Segments.getSegmentsAndPointsCrossingAmounts(new int[] {0, 1, 2, 3, 3, 3}, new int[] {3, 3, 3, 4, 5, 6}, points));
    }

    @Test
    public void anotherTestFromStepik() {
        int[] points = new int[]{-3, -1, 0, 2, 3};

        Assert.assertEquals(Arrays.asList(0, 4, 5, 7, 6),
                Segments.getSegmentsAndPointsCrossingAmounts(new int[] {-2, 0, -1, -1, 0, -2, 1, 2, 1, 2}, new int[] {3, 3, 0, 3, 1, -1, 3, 3, 2, 3}, points));
    }

    @Test
    public void test() {
        int[] points = new int[]{1, -1};

        Assert.assertEquals(Arrays.asList(2, 4),
                Segments.getSegmentsAndPointsCrossingAmounts(new int[] {-3, -2, -2, -1}, new int[] {-1, 0, 3, 2}, points));
    }

    @Test
    public void testWithDot() {
        int[] points = new int[]{1, 3};

        Assert.assertEquals(Arrays.asList(1, 0),
                Segments.getSegmentsAndPointsCrossingAmounts(new int[] {1}, new int[] {1}, points));
    }
}
