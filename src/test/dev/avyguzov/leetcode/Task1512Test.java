package dev.avyguzov.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1512Test {
    @Test
    public void simpleTest() {
        Assertions.assertEquals(4, Task1512.solution(new int[] {1,2,3,1,1,3}));
    }

    @Test
    public void simpleTest2() {
        Assertions.assertEquals(6, Task1512.solution(new int[] {1,1,1,1}));
    }

    @Test
    public void simpleTest3() {
        Assertions.assertEquals(0, Task1512.solution(new int[] {1,2,3}));
    }
}
