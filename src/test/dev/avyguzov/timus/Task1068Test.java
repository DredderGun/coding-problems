package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1068Test {
    @Test
    public void test1() {
        Assertions.assertEquals(-5, Task1068.solution(-3));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(1, Task1068.solution(0));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(1, Task1068.solution(1));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(15, Task1068.solution(5));
    }
}
