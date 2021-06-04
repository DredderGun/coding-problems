package dev.avyguzov.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1295Test {
    @Test
    public void simpleTest() {
        Assertions.assertEquals(1, Task1295.solution(new int[] {555, 901, 482, 1771}));
    }

    @Test
    public void simpleTest2() {
        Assertions.assertEquals(2, Task1295.solution(new int[] {12, 345, 2, 6, 7896}));
    }

    @Test
    public void simpleTest3() {
        Assertions.assertEquals(0, Task1295.solution(new int[] {1, 1, 1, 1}));
    }
}
