package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1880Test {
    @Test
    public void testFromDesc() {
        Assertions.assertEquals(3, Task1880.solution(new int[] {13, 20, 22, 43, 146},
                new int[] {13, 22, 43, 146}, new int[] {13, 43, 67, 89, 146}));
    }

    @Test
    public void test1() {
        Assertions.assertEquals(1, Task1880.solution(new int[] {2}, new int[] {2}, new int[] {2}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(0, Task1880.solution(new int[] {2}, new int[] {4}, new int[] {2}));
    }
}