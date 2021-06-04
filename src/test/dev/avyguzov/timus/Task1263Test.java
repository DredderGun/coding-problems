package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1263Test {
    @Test
    public void test1() {
        Assertions.assertArrayEquals(new String[] {"50.00%", "33.33%", "16.67%"}, Task1263.solution(new int[] {1, 2, 3, 2, 1, 1}, 3));
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(new String[] {"100.00%"}, Task1263.solution(new int[] {1, 1, 1, 1, 1, 1}, 1));
    }
}
