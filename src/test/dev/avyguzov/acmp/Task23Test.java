package dev.avyguzov.acmp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task23Test {

    @Test
    public void simpleTest() {
        Assertions.assertEquals(12, Task23.solution(6));
        Assertions.assertEquals(18, Task23.solution(10));
        Assertions.assertEquals(0, Task23.solution(0));
        Assertions.assertEquals(1, Task23.solution(1));
    }
}
