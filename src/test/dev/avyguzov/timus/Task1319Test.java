package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1319Test {
    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[][] {
                    new int[] {4, 2, 1},
                    new int[] {7, 5, 3},
                    new int[] {9, 8, 6}
                },
            Task1319.solution(3));
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(new int[][] {
                        new int[] {2, 1},
                        new int[] {4, 3}
                },
                Task1319.solution(2));
    }
}
