package dev.avyguzov.stepik.data.structures.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SlidingWindowMaximumTest {

    @Test
    void simpleTest1() {
        SlidingWindowMaximum slidingWindow = new SlidingWindowMaximum();
        Assertions.assertEquals("7 7 5 6 6", slidingWindow.solution(new int[] {2, 7, 3, 1, 5, 2, 6, 2}, 4));
    }

    @Test
    void simpleTest2() {
        SlidingWindowMaximum slidingWindow = new SlidingWindowMaximum();
        Assertions.assertEquals("7 7 5 5 6 6", slidingWindow.solution(new int[] {2, 7, 3, 1, 5, 2, 6, 2}, 3));
    }

    @Test
    void simpleTest3() {
        SlidingWindowMaximum slidingWindow = new SlidingWindowMaximum();
        Assertions.assertEquals("2 1 5", slidingWindow.solution(new int[] {2, 1, 5}, 1));
    }

    @Test
    void simpleTest4() {
        SlidingWindowMaximum slidingWindow = new SlidingWindowMaximum();
        Assertions.assertEquals("9", slidingWindow.solution(new int[] {2, 3, 9}, 3));
    }

    @Test
    void simpleTest5() {
        SlidingWindowMaximum slidingWindow = new SlidingWindowMaximum();
        Assertions.assertEquals("93 93 93 93", slidingWindow.solution(new int[] {28, 7, 64, 40, 68, 86, 80, 93, 4, 53, 32, 56, 68, 18, 59}, 12));
    }
}
