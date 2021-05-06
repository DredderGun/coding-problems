package dev.avyguzov.timus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Task1197Test {
    @Test
    public void testFromProblemDesc() {
        Assertions.assertEquals(Arrays.asList(2, 8, 6), Task1197.solution(new String[] {"a1", "d4", "g6"}));
    }

    @Test
    public void simpleTest1() {
        Assertions.assertEquals(Arrays.asList(2), Task1197.solution(new String[] {"h8"}));
    }

    @Test
    public void simpleTest2() {
        Assertions.assertEquals(Arrays.asList(8), Task1197.solution(new String[] {"e5"}));
    }
}
