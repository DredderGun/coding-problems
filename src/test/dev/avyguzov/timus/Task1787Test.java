package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Task1787Test {
    @Test
    public void testFromDesc() {
        Assertions.assertEquals(0, Task1787.solution(5, Arrays.asList(6, 7, 2)));
    }

    @Test
    public void testFromDesc2() {
        Assertions.assertEquals(5, Task1787.solution(5, Arrays.asList(20, 0, 0)));
    }

    @Test
    public void simpleTest() {
        Assertions.assertEquals(0, Task1787.solution(4, Arrays.asList(4, 4, 4)));
    }
}
