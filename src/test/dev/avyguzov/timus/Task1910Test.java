package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1910Test {
    @Test
    public void testFromDesc() {
        Assertions.assertArrayEquals(new int[] {12, 3}, Task1910.solution(new int[] {1, 4, 4, 4, 1, 1}));
    }

    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[] {9, 2}, Task1910.solution(new int[] {1, 4, 4}));
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(new int[] {3, 2}, Task1910.solution(new int[] {1, 1, 1, 1, 1, 1, 1, 1}));
    }
}
