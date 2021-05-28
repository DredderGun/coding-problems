package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1209Test {

    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[] {0, 0, 1, 0}, Task1209.solution(new int[] {3, 14, 7, 6}));
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(new int[] {0, 0, 0, 0}, Task1209.solution(new int[] {1048576, 1048576, 1048576, 1048576}));
    }
}
