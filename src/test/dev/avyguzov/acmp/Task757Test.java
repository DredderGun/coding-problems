package dev.avyguzov.acmp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task757Test {

    @Test
    public void simpleTest() {
        Assertions.assertEquals(1, Task757.solution(2, 6, 1));
        Assertions.assertEquals(0, Task757.solution(10, 5, 12));
        Assertions.assertEquals(3, Task757.solution(18, 35, 3));
        Assertions.assertEquals(0, Task757.solution(1, 35, 999));
        Assertions.assertEquals(0, Task757.solution(18, 1, 999));
        Assertions.assertEquals(0, Task757.solution(18, 1, 0));
        Assertions.assertEquals(0, Task757.solution(0, 0, 0));
    }
}
