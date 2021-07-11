package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1991Test {
    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[] {2, 8}, Task1991.solution(new int[] {2, 7, 5, 0}, 5));
    }
}
