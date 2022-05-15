package dev.avyguzov.stepik.data.structures.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayToHeapTransformerTest {

    @Test
    void simpleTest1() {
        ArrayToHeapTransformer t = new ArrayToHeapTransformer();
        long[] ar = new long[] {5, 4, 3, 2, 1};
        t.transformArrayToHeap(ar);
        Assertions.assertArrayEquals(new long[] {1, 2, 3, 5, 4}, ar);
    }

    @Test
    void simpleTest2() {
        ArrayToHeapTransformer t = new ArrayToHeapTransformer();
        long[] ar = new long[] {1, 2, 3, 4, 5};
        t.transformArrayToHeap(ar);
        Assertions.assertArrayEquals(new long[] {1, 2, 3, 4, 5}, ar);
    }

    @Test
    void simpleTest3() {
        ArrayToHeapTransformer t = new ArrayToHeapTransformer();
        long[] ar = new long[] {0, 1, 2, 3, 4, 6};
        t.transformArrayToHeap(ar);
        Assertions.assertArrayEquals(new long[] {0, 1, 2, 3, 4, 6}, ar);
    }

    @Test
    void simpleTest4() {
        ArrayToHeapTransformer t = new ArrayToHeapTransformer();
        long[] ar = new long[] {7, 6, 5, 4, 3, 2};
        t.transformArrayToHeap(ar);
        Assertions.assertArrayEquals(new long[] {2, 3, 5, 4, 6, 7}, ar);
    }

    @Test
    void simpleTest5() {
        ArrayToHeapTransformer t = new ArrayToHeapTransformer();
        long[] ar = new long[] {7, 6};
        t.transformArrayToHeap(ar);
        Assertions.assertArrayEquals(new long[] {6, 7}, ar);
    }

    @Test
    void simpleTest6() {
        ArrayToHeapTransformer t = new ArrayToHeapTransformer();
        long[] ar = new long[] {7};
        t.transformArrayToHeap(ar);
        Assertions.assertArrayEquals(new long[] {7}, ar);
    }
}