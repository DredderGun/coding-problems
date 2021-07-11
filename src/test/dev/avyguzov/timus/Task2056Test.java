package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2056Test {

    @Test
    public void test1() {
        Assertions.assertEquals("None", Task2056.solution(new int[] {3, 3, 3, 3}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("Common", Task2056.solution(new int[] {4, 4, 5, 4}));
    }

    @Test
    public void test3() {
        Assertions.assertEquals("Named", Task2056.solution(new int[] {5, 5, 5}));
    }

    @Test
    public void test4() {
        Assertions.assertEquals("High", Task2056.solution(new int[] {4, 5, 5, 5}));
    }
}
