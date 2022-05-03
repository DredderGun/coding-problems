package dev.avyguzov.shad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrSumTest {
    @Test
    public void simpleTest1() {
        Assertions.assertEquals(362018, ArrSum.solution(new int[] {362018}));
    }

    @Test
    public void simpleTest2() {
        Assertions.assertEquals(2036, ArrSum.solution(new int[] {3, 6, 2018}));
    }

    @Test
    public void simpleTest3() {
        Assertions.assertEquals(53, ArrSum.solution(new int[] {3, 6, 2, 0, 1, 8}));
    }

    @Test
    public void simpleTest4() {
        Assertions.assertEquals(12, ArrSum.solution(new int[] {1, 1, 1, 1, 1}));
    }

    @Test
    public void simpleTest5() {
        Assertions.assertEquals(56, ArrSum.solution(new int[] {1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void simpleTest6() {
        Assertions.assertEquals(3, ArrSum.solution(new int[] {1, 2}));
    }

    @Test
    public void simpleTest7() {
        Assertions.assertEquals(89, ArrSum.solution(new int[] {6, 7, 3, 8, 1, 9}));
    }
}