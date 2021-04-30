package dev.avyguzov.acmp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task148Test {
    @Test
    public void simpleTest() {
        Assertions.assertEquals(6, Task148.solution(12, 42));
        Assertions.assertEquals(4, Task148.solution(8, 12));
        Assertions.assertEquals(1, Task148.solution(1, 1));
        Assertions.assertEquals(1, Task148.solution(1, 5));
    }
}
