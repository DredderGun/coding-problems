package dev.avyguzov.stepik.data.structures.queues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParallelProcessingProblemTest {
    @Test
    void simpleTest1() {
        long[][] arr = new long[2][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new long[] {i, 0};
        }
        ParallelProcessingProblem o = new ParallelProcessingProblem();
        Assertions.assertArrayEquals(new long[]{0, 0}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{1, 0}, o.addToQueue(arr, 0, 2));
        Assertions.assertArrayEquals(new long[]{0, 1}, o.addToQueue(arr, 0, 3));
        Assertions.assertArrayEquals(new long[]{1, 2}, o.addToQueue(arr, 0, 4));
        Assertions.assertArrayEquals(new long[]{0, 4}, o.addToQueue(arr, 0, 5));
    }

    @Test
    void simpleTest2() {
        long[][] arr = new long[4][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new long[] {i, 0};
        }
        ParallelProcessingProblem o = new ParallelProcessingProblem();
        Assertions.assertArrayEquals(new long[]{0, 0}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{1, 0}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{2, 0}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{3, 0}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{0, 1}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{1, 1}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{2, 1}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{3, 1}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{0, 2}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{1, 2}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{2, 2}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{3, 2}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{0, 3}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{1, 3}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{2, 3}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{3, 3}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{0, 4}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{1, 4}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{2, 4}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{3, 4}, o.addToQueue(arr, 0, 1));
    }

    @Test
    void simpleTest3() {
        long[][] arr = new long[2][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new long[] {i, 0};
        }
        ParallelProcessingProblem o = new ParallelProcessingProblem();
        Assertions.assertArrayEquals(new long[]{0, 0}, o.addToQueue(arr, 0, 0));
        Assertions.assertArrayEquals(new long[]{0, 0}, o.addToQueue(arr, 0, 0));
        Assertions.assertArrayEquals(new long[]{0, 0}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{1, 0}, o.addToQueue(arr, 0, 0));
        Assertions.assertArrayEquals(new long[]{1, 0}, o.addToQueue(arr, 0, 0));
        Assertions.assertArrayEquals(new long[]{1, 0}, o.addToQueue(arr, 0, 0));
        Assertions.assertArrayEquals(new long[]{1, 0}, o.addToQueue(arr, 0, 2));
        Assertions.assertArrayEquals(new long[]{0, 1}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{0, 2}, o.addToQueue(arr, 0, 2));
        Assertions.assertArrayEquals(new long[]{1, 2}, o.addToQueue(arr, 0, 3));
        Assertions.assertArrayEquals(new long[]{0, 4}, o.addToQueue(arr, 0, 0));
        Assertions.assertArrayEquals(new long[]{0, 4}, o.addToQueue(arr, 0, 0));
        Assertions.assertArrayEquals(new long[]{0, 4}, o.addToQueue(arr, 0, 0));
        Assertions.assertArrayEquals(new long[]{0, 4}, o.addToQueue(arr, 0, 2));
        Assertions.assertArrayEquals(new long[]{1, 5}, o.addToQueue(arr, 0, 1));
    }

    @Test
    void simpleTest4() {
        long[][] arr = new long[4][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new long[] {i, 0};
        }
        ParallelProcessingProblem o = new ParallelProcessingProblem();
        Assertions.assertArrayEquals(new long[]{0, 0}, o.addToQueue(arr, 0, 3));
        Assertions.assertArrayEquals(new long[]{1, 0}, o.addToQueue(arr, 0, 0));
        Assertions.assertArrayEquals(new long[]{1, 0}, o.addToQueue(arr, 0, 9));
        Assertions.assertArrayEquals(new long[]{2, 0}, o.addToQueue(arr, 0, 2));
        Assertions.assertArrayEquals(new long[]{3, 0}, o.addToQueue(arr, 0, 8));
        Assertions.assertArrayEquals(new long[]{2, 2}, o.addToQueue(arr, 0, 1));
        Assertions.assertArrayEquals(new long[]{0, 3}, o.addToQueue(arr, 0, 9));
        Assertions.assertArrayEquals(new long[]{2, 3}, o.addToQueue(arr, 0, 8));
        Assertions.assertArrayEquals(new long[]{3, 8}, o.addToQueue(arr, 0, 8));
        Assertions.assertArrayEquals(new long[]{1, 9}, o.addToQueue(arr, 0, 4));
    }
}