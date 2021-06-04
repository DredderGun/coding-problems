package dev.avyguzov.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1470Test {
    @Test
    public void simpleTest() {
        Assertions.assertArrayEquals(new int[] {2, 3, 5, 4, 1, 7}, Task1470.solution(new int[] {2, 5, 1, 3, 4, 7}, 3));
    }

    @Test
    public void simpleTest2() {
        Assertions.assertArrayEquals(new int[] {1,4,2,3,3,2,4,1}, Task1470.solution(new int[] {1,2,3,4,4,3,2,1}, 4));
    }

    @Test
    public void simpleTest3() {
        Assertions.assertArrayEquals(new int[] {1,2,1,2}, Task1470.solution(new int[] {1,1,2,2}, 2));
    }

    @Test
    public void simpleTest4() {
        Assertions.assertArrayEquals(new int[] {1,2}, Task1470.solution(new int[] {1,2}, 1));
    }
}
