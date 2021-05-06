package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2066Test {
    @Test
    public void testFromDesc() {
        Assertions.assertEquals(-5, Task2066.solution(1, 2, 3));
    }

    @Test
    public void simpleTest1() {
        Assertions.assertEquals(-1, Task2066.solution(1, 1, 1));
    }

    @Test
    public void simpleTest2() {
        Assertions.assertEquals(-2, Task2066.solution(0, 1, 1));
    }

    @Test
    public void simpleTest3() {
        Assertions.assertEquals(-4, Task2066.solution(0, 2, 2));
    }

    @Test
    public void simpleTest4() {
        Assertions.assertEquals(-5, Task2066.solution(1, 2, 3));
    }

    @Test
    public void simpleTest5() {
        Assertions.assertEquals(-5, Task2066.solution(1, 2, 3));
    }

    @Test
    public void simpleTest6() {
        Assertions.assertEquals(-7, Task2066.solution(0, 0, 7));
    }
}
