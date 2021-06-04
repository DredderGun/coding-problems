package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1225Test {
    @Test
    public void test1() {
        Assertions.assertEquals(2, Task1225.solution(1));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(2, Task1225.solution(2));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(4, Task1225.solution(3));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(2269806340L, Task1225.solution(45));
    }
}
